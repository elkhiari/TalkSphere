package com.example.talksphere.controller;

import com.example.talksphere.model.User;
import com.example.talksphere.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        try {
            User createdUser = service.create(user.getUsername());
            return ResponseEntity.ok(createdUser);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return ResponseEntity.status(500).build();
        }
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> users = service.findAll();
        return ResponseEntity.ok(users);
    }
}
