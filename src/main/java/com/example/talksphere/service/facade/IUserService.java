package com.example.talksphere.service.facade;

import com.example.talksphere.model.User;

import java.util.List;

public interface IUserService {
    public User create(User user);
    public List<User> findAll();
}
