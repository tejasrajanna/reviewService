package com.reviewservice.learning.controller;

import com.reviewservice.learning.model.users;
import com.reviewservice.learning.service.UserService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class userController {
    private final UserService userService;

    public userController(UserService userService){
        this.userService=userService;
    }

    @PostMapping
    @Validated
    public ResponseEntity addUser(@RequestBody users users){
        try {
            Boolean res=userService.addusers(users);
            System.out.println(res);
            if(res.equals(Boolean.FALSE)){
                return ResponseEntity.status(HttpStatus.CREATED).build();
            }
            else{
                throw new Exception("Exception message");
            }

        }

        catch (Exception e){
            return ResponseEntity.unprocessableEntity().build();
        }
    }

    @PutMapping
    @Validated
    public ResponseEntity  updateUser(@NotNull @RequestBody users user){
        try {


            userService.updateUsers(user);
            return ResponseEntity.ok().build();
        }

        catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }


    }

   @GetMapping
    public ResponseEntity<Optional<users>> getAllUsers(@RequestBody users user){
        try {

            return ResponseEntity.ok(userService.getUserByUsername(user));
        }

        catch (Exception e){
            System.out.println(e);
            return ResponseEntity.notFound().build();
        }
    }




    @DeleteMapping
    public void getUserbyUsername(){

    }



}
