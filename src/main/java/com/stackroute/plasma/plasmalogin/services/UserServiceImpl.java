package com.stackroute.plasma.plasmalogin.services;

import com.stackroute.plasma.plasmalogin.exception.UserNotFoundException;
import com.stackroute.plasma.plasmalogin.model.User;
import com.stackroute.plasma.plasmalogin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User saveUsers(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    @Override
    public User findByUserIdAndPassword(String managerId, String password) {
        return userRepository.findByUserIdAndPassword(managerId,password);
    }

}



