package com.reviewservice.learning.service;

import com.reviewservice.learning.model.hotels;
import com.reviewservice.learning.repository.HotelRepository;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
    private final HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository){
        this.hotelRepository=hotelRepository;
    }

    public void addHotel(hotels hotels){
        hotelRepository.insert(hotels);

    }

    public void updateHotel(hotels hotels){

    }
}
