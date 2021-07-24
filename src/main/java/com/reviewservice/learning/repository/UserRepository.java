package com.reviewservice.learning.repository;

import com.reviewservice.learning.model.users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends MongoRepository <users,String> {
    Optional<users> findAllByUsername(String username);

    List<users> existsByUsername(String username);
}

