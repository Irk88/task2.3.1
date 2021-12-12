package com.irikkashapov.spring.service;

import com.irikkashapov.spring.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    void removeUserById(long id);

    User getUserById(long id);

    List<User> getAllUsers();
}
