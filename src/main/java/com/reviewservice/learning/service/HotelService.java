package com.reviewservice.learning.service;

import com.reviewservice.learning.model.CuisineEnum;
import com.reviewservice.learning.model.Hotels;
import com.reviewservice.learning.repository.HotelRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HotelService {
    private final HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository){
        this.hotelRepository=hotelRepository;
    }

    public static Object findByHotelCuisine(CuisineEnum cuisine) {
        return cuisine;
    }


    public void addHotel(@NotNull Hotels hotels){
        hotelRepository.insert(hotels);

    }

    public Optional<Hotels> findByHotelId(@NotNull String id){
        return hotelRepository.findById(id);
    }

    public Optional<Hotels> findByHotelCuisine(@NotNull String cuisine){
        return hotelRepository.findByCuisine(cuisine);
    }


    public void updateHotel(Hotels hotels){

    }
}
