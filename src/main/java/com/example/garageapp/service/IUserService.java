package com.example.garageapp.service;

import com.example.garageapp.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    public List<User> findAllUsers() ;

    public Optional<User> findUserById(int id);

    public User findByUserName(String userName) ;
}
