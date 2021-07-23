package com.reviewservice.learning.controller;


import com.reviewservice.learning.model.hotels;
import com.reviewservice.learning.repository.UserRepository;
import com.reviewservice.learning.service.HotelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/hotels")
public class hotelController {
    private final HotelService hotelService;

    public hotelController(HotelService hotelService){
        this.hotelService=hotelService;
    }

    @PostMapping
    @Validated
    public ResponseEntity addHotel(@RequestBody hotels hotel){
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
    public ResponseEntity updateHotel(@RequestBody hotels hotel){
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
    public ResponseEntity <List<hotels>> findByHotelName(@RequestBody hotels hotel){
        return ResponseEntity.ok(hotelService.fingByHotelName("chungs"));
    }
}

