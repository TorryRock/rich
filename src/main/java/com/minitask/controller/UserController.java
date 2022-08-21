package com.minitask.controller;

import com.minitask.pojo.User;
import com.minitask.service.UserManageServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/getUserById")
    public User getUserById(){
        return userManageService.getUserById(1);
    }

    @GetMapping("/addUser")
    public String addUser(){
        userManageService.addUser(1,"一号选手","pass1");
        return "添加成功";

    }

    @GetMapping("/updateUser")
    public String updateUser(){
        userManageService.updateUser(1,"一号选手升级版","pass2");
        return "更改成功";
    }

    @GetMapping("/deleteUserById")
    public String deleteUserById(){
        userManageService.deleteUserById(1);
        return "删除成功";
    }
}
