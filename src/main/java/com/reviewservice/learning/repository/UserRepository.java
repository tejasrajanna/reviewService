package com.reviewservice.learning.repository;

import com.reviewservice.learning.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends MongoRepository <Users,String> {
    Optional<Users> findAllByUsername(String username);

    Boolean existsByUsername(String username);

    List<Users> findAllByFirstName(String firstName);
}

