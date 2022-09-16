package com.minitask.service;

import com.minitask.pojo.User;

import java.util.List;

public interface UserManageService {
    void addUser(User user);
    void deleteUserById(int id);
    void updateUser(int id,String name,String password);
    User getUserById(int id);
    List<User> getAllUser();

}
