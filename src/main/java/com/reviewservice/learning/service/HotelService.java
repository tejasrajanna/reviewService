package com.reviewservice.learning.service;

import com.reviewservice.learning.model.hotels;
import com.reviewservice.learning.repository.HotelRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {
    private final HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository){
        this.hotelRepository=hotelRepository;
    }



    public void addHotel(@NotNull hotels hotels){
        hotelRepository.insert(hotels);

    }

    public Optional<hotels> findByHotelId(@NotNull String id){
        return hotelRepository.findById(id);
    }



    public void updateHotel(hotels hotels){

    }
}
