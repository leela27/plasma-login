package com.stackroute.plasma.plasmalogin.services;

import com.stackroute.plasma.plasmalogin.exception.UserNotFoundException;
import com.stackroute.plasma.plasmalogin.model.User;

import java.util.List;

public interface UserService {



    public User saveUsers(User user);       // throws UserNotFoundException;
    public List<User> getAllUsers();
    public User findByUserIdAndPassword(String userId, String password);
}

