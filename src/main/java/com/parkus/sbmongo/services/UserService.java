package com.parkus.sbmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkus.sbmongo.domain.User;
import com.parkus.sbmongo.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
