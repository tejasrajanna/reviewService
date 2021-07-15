package com.reviewservice.learning.repository;

import com.reviewservice.learning.model.users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository <users,String> {
}
