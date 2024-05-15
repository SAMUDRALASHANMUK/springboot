package com.msf.Springboot.Learning.task.service;

import com.msf.Springboot.Learning.task.model.User;
import com.msf.Springboot.Learning.task.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer id) {
        return userRepository.getReferenceById(id);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
