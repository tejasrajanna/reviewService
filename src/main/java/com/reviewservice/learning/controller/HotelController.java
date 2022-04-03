package com.reviewservice.learning.controller;


import com.reviewservice.learning.model.Hotels;
import com.reviewservice.learning.service.HotelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {
    private final HotelService hotelService;

    public HotelController(HotelService hotelService){
        this.hotelService=hotelService;
    }

    @PostMapping
    @Validated
    public ResponseEntity addHotel(@RequestBody Hotels hotel){
        try {
            hotelService.addHotel(hotel);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
       catch (Exception e){
            System.out.println(e);

            return ResponseEntity.unprocessableEntity().build();
       }
    }


    @PutMapping
    public ResponseEntity updateHotel(@RequestBody Hotels hotel){
        try{
            hotelService.updateHotel(hotel);
            return ResponseEntity.ok().build();
        }

        catch (Exception e){
            System.out.println(e);
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity <List<Hotels>> findByHotelName(@RequestBody Hotels hotel){
        //return ResponseEntity.ok(hotelService.fingByHotelName("chungs"));
     return ResponseEntity.ok().build();
    }

    @GetMapping("/temp")
    public ResponseEntity <Optional<Hotels>> findByHotelCuisine(@RequestBody Hotels hotel){
        return ResponseEntity.ok().build();
    }
}

