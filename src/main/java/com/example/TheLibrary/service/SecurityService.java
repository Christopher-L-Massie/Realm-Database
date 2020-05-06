package com.example.TheLibrary.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
