package com.reviewservice.learning.controller;

import com.reviewservice.learning.model.Users;
import com.reviewservice.learning.service.UserService;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping
    @Validated
    public ResponseEntity addUser(@RequestBody Users users){
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
    public ResponseEntity  updateUser(@NotNull @RequestBody Users user){
        try {


            userService.updateUsers(user);
            return ResponseEntity.ok().build();
        }

        catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }


    }

   @GetMapping
    public ResponseEntity<Optional<Users>> getAllUsers(@RequestBody Users user){
        try {

            return ResponseEntity.ok(userService.getUserByUsername(user));
        }

        catch (Exception e){
            System.out.println(e);
            return ResponseEntity.notFound().build();
        }
    }




  

}
