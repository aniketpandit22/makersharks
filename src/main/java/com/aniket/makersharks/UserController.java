package com.aniket.makersharks;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserInterface userInterface;

    @PostMapping("/register")
    public ResponseEntity<Object> registerUser(@Valid @RequestBody UserTable userData) throws Exception{
        return userInterface.registerUser(userData);
    }

    @GetMapping("/fetch")
    public ResponseEntity<Object> fetchUser(@Param("username") String username){
        return userInterface.fetchUser(username);
    }
}
