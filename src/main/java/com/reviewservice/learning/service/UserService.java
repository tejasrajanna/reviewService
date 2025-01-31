package com.reviewservice.learning.service;


import com.reviewservice.learning.repository.UserRepository;
import com.reviewservice.learning.model.Users;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    public boolean addusers(Users user) {
        if(userRepository.existsByUsername(user.getUsername()).equals(false)){
            return Boolean.FALSE;
        }
        else if(userRepository.existsByUsername(user.getUsername()).equals(false)) {
            userRepository.insert(user);
            return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
    public void updateUsers(@NotNull Users user){
        Users users=userRepository.findById(user.getId())
                .orElseThrow(() -> new RuntimeException(
                        String.format("cannot find user by Id",user.getId())));


        users.setUsername(user.getUsername());
        users.setFirstName(user.getFirstName());
        users.setLastName(user.getLastName());
        users.setReviewerId(user.getReviewerId());

        userRepository.save(users);
    }


    public List<Users> getAllUsers(){
        return userRepository.findAll();


    }
    public Optional<Users> getUserByUsername(Users user){
        return userRepository.findAllByUsername(user.getUsername());

    }
}
