package com.aniket.makersharks;

import org.springframework.http.ResponseEntity;

public interface UserInterface {
    // Save operation
    ResponseEntity<Object> registerUser(UserTable user);

    // Read operation
    ResponseEntity<Object> fetchUser(String username);
}
