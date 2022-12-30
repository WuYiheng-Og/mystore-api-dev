package com.mystore.mystoreapidev;

import com.mystore.mystoreapidev.domain.User;
import com.mystore.mystoreapidev.persistence.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MystoreApiDevApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
    }
    @Test
    public void testMB(){
        System.out.println(userMapper);
        List<User> users = userMapper.selectList(null);
        System.out.println(users.size());
    }

}
