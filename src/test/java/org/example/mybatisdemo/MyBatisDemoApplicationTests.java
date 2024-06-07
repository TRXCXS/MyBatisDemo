package org.example.mybatisdemo;

import org.example.mybatisdemo.mapper.UserMapper;
import org.example.mybatisdemo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MyBatisDemoApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testGetAllUsers() {
        List<User> users = userMapper.getAllUsers();
        users.forEach(System.out::println);
    }

}
