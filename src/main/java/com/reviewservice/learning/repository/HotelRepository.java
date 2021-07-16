package com.reviewservice.learning.repository;


import com.reviewservice.learning.model.hotels;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends MongoRepository<hotels,String> {

}
