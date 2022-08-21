package com.minitask.service;

import com.minitask.mapper.UserMapper;
import com.minitask.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserManageServiceImpl implements UserManageService{
    @Resource
    UserMapper userMapper;
    @Override
    public void addUser(int id,String name, String password) {
        User user = new User(id,name,password);
        userMapper.addUser(user);
    }

    @Override
    public void deleteUserById(int id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public void updateUser(int id, String name, String password) {
        User user = new User(id,name,password);
        userMapper.updateUser(user);
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
