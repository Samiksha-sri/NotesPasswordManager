package com.example.NotesPasswordManager.NotesPasswordManager.controllers;

import com.example.NotesPasswordManager.NotesPasswordManager.models.User;
import com.example.NotesPasswordManager.NotesPasswordManager.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/user/register")
    public ResponseEntity<User> registerUser(@RequestBody User user){
        try{
            User registeredUser = userService.registerUser(user);
            return ResponseEntity.ok(registeredUser);
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }

    }


}
