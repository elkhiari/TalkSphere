package com.example.talksphere.service;

import com.example.talksphere.model.User;
import com.example.talksphere.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public UserRepository repository;

    public UserService(UserRepository userRepository) {
        this.repository = userRepository;
    }

    public User create(String username) {
        try {
            User user = new User(username);
            return repository.insert(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<User> findAll() {
        return repository.findAll();
    }
}
