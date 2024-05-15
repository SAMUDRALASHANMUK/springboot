package com.msf.Springboot.Learning.task.controller;

import com.msf.Springboot.Learning.task.model.User;
import com.msf.Springboot.Learning.task.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userServiceImpl;

    @PostMapping
    public User saveUser(@RequestBody User userRequest) {
        return userServiceImpl.saveUser(userRequest);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userServiceImpl.getAllUsers();
    }

    @GetMapping
    public User getUserById1(@RequestParam Integer id) {
        return userServiceImpl.getUserById(id);
    }

    @PutMapping
    public User updateUser(User userRequest) {
        return userServiceImpl.updateUser(userRequest);
    }

}
