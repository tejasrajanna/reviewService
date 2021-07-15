package com.reviewservice.learning.controller;

import com.reviewservice.learning.model.users;
import com.reviewservice.learning.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class userController {
    private final UserService userService;

    public userController(UserService userService){
        this.userService=userService;
    }

    @PostMapping
    public ResponseEntity addUser(@RequestBody users users){
        userService.addusers(users);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /*@PostMapping
    public ResponseEntity  updateUser(@RequestBody users user){
        userService.updateUsers(user);
        return ResponseEntity.ok().build();

    }

   /* @GetMapping
    public ResponseEntity<List<users>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping
    public void getUserbyUsername(){

    }*/



}
