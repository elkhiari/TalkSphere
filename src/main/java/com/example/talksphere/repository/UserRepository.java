package com.example.talksphere.repository;

import com.example.talksphere.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository
        extends MongoRepository<User, String> {
}
