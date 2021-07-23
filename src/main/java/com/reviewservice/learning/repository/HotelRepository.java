package com.reviewservice.learning.repository;


import com.reviewservice.learning.model.hotels;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HotelRepository extends MongoRepository<hotels,String> {





}
