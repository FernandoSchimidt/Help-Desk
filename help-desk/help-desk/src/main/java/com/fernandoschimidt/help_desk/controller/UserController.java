package com.fernandoschimidt.help_desk.controller;


import com.fernandoschimidt.help_desk.entity.User;
import com.fernandoschimidt.help_desk.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

//    @GetMapping("/{username}")
//    public Optional<User> getUserByUsername(@PathVariable String username) {
//        return userService.findByUsername(username);
//    }
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users= userService.findAll();
        return  new ResponseEntity<>(users, HttpStatus.OK);
    }
}
