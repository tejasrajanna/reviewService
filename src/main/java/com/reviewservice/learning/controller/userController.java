package com.reviewservice.learning.controller;

import com.reviewservice.learning.model.users;
import com.reviewservice.learning.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class userController {
    private final UserService userService;

    public userController(UserService userService){
        this.userService=userService;
    }

    @PostMapping
    public ResponseEntity addUser(@RequestBody users users){
        try {
            userService.addusers(users);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }

        catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }

    @PutMapping
    public ResponseEntity  updateUser(@RequestBody users user){
        try {


            userService.updateUsers(user);
            return ResponseEntity.ok().build();
        }

        catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }


    }

   @GetMapping
    public ResponseEntity<List<users>> getAllUsers(){
        try {

            return ResponseEntity.ok(userService.getAllUsers());
        }

        catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }




    @DeleteMapping
    public void getUserbyUsername(){

    }



}
