package com.minitask.mapper;

import com.minitask.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface UserMapper {

    List<User> getAllUser();

    User getUserById(int id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(int id);

}
