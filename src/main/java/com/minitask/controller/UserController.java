package com.minitask.controller;

import com.minitask.pojo.User;
import com.minitask.service.UserManageServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    UserManageServiceImpl userManageService;

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userManageService.getAllUser();
    }

    @GetMapping(value = "/getUserById")
    public User getUserById(@RequestParam(value = "id") int id){
        return userManageService.getUserById(id);
    }

    @GetMapping(value = "/addUser")
    public String addUser(@RequestBody User user){
        userManageService.addUser(user);
        return "更新数据成功：id=" + user.getId() + "，name=" + user.getName() + "，password=" + user.getPwd();
    }

    @GetMapping(value = "/updateUser")
    public String updateUser(@RequestParam(value = "id") int id,@RequestParam(value = "name") String name,@RequestParam(value = "password") String password){
        userManageService.updateUser(id,name,password);
        return "更新数据成功：id=" + id + "，name=" + name + "，password=" + password;
    }

    @GetMapping (value = "/deleteUserById")
    public String deleteUserById(@RequestParam(value = "id") int id){
        userManageService.deleteUserById(id);
        return "删除成功";
    }
}
