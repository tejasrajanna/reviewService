package com.reviewservice.learning.service;


import com.reviewservice.learning.repository.UserRepository;
import com.reviewservice.learning.model.users;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    public void addusers(users user) {
        userRepository.insert(user);

    }
    public void updateUsers(users user){
        users users=userRepository.findById(user.getId())
                .orElseThrow(() -> new RuntimeException(
                        String.format("cannot find user by Id",user.getId())));

    }
    /*public List<users> getAllUsers(){
        return userRepository.findAll();


    }
    public void getUserByUsername(){

    }*/
}
