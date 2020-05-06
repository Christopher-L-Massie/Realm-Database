package com.example.TheLibrary.service;

import com.example.TheLibrary.models.Accounts.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
