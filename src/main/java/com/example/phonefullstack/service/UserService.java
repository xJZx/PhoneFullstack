package com.example.phonefullstack.service;

import com.example.phonefullstack.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);

    public List<User> getAllUsers();
}
