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

    int addUser(User user);

    int updateUser(User user);

    int deleteUserById(int id);

}
