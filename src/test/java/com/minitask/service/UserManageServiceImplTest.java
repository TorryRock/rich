package com.minitask.service;

import com.minitask.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UserManageServiceImplTest {
    @Resource
    UserManageServiceImpl userManageServiceImpl;
    @Test
    public void getUserByIdTest() {
        User user = userManageServiceImpl.getUserById(1);
        assert(user.getId()==1);
        userManageServiceImpl.deleteUserById(1);
        assert (userManageServiceImpl.getAllUser().size()==2);
    }
}