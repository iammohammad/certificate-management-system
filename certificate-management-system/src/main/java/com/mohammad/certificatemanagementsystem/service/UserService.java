package com.mohammad.certificatemanagementsystem.service;

import com.mohammad.certificatemanagementsystem.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User updateUser(Long id, User user);
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User creatUser(User user);
    void deleteUser(Long id);
}
