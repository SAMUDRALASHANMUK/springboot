package com.msf.Springboot.Learning.task.service;


import com.msf.Springboot.Learning.task.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User userRequest);

    List<User> getAllUsers();

    User getUserById(Integer id);

    User updateUser(User userRequest);
}
