package com.aniket.makersharks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserInterface {

    @Autowired
    UserRepository userRepository;
    @Override
    public ResponseEntity<Object> registerUser(UserTable user) {
        try{
            Boolean userExists = userRepository.existsByUsername(user.getUsername());
            if (userExists){
                return ResponseEntity.ok("User already exist");
            } else {
                UserTable savedUser = userRepository.save(user);
                return ResponseEntity.ok(savedUser);
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ResponseEntity<Object> fetchUser(String username) {
        try {
            UserTable data = userRepository.findByUsername(username);

            if (data!=null)
                return ResponseEntity.ok(data);
            else
                return ResponseEntity.ok("User not found with username : " + username);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
