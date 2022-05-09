package com.example.garageapp.service;

import com.example.garageapp.model.User;
import com.example.garageapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepo;


    public List<User> findAllUsers() {
        return userRepo.findAll();
    }


    public Optional<User> findUserById(int id) {
        return userRepo.findById(id);
    }

    public User findByUserName(String userName) {

        User user=userRepo.findByUserName(userName);
        return user;

    }

    public User saveUser(User newUser) {

        User user=userRepo.save(newUser);
        return user;

    }

    public User updateUser(int id,User user) {

        Optional<User> retrievedUser=userRepo.findById(id);
        if(retrievedUser==null)
            try {
                throw new Exception("User not found");
            } catch (Exception e) {
                e.printStackTrace();
            }
        userRepo.save(user);
        return userRepo.findById(id).get();

    }

    public User deleteUser(int userId) {

        Optional<User> retrievedUser=userRepo.findById(userId);
        if(retrievedUser==null)
            try {
                throw new Exception("User not found");
            } catch (Exception e) {
                e.printStackTrace();
            }
        userRepo.deleteById(userId);
        return retrievedUser.get();



    }
}
