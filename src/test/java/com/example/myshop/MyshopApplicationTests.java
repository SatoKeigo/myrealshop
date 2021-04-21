package com.example.myshop;

import com.example.myshop.bean.User;
import com.example.myshop.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyshopApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        String name="admin";
        String password="admin";
        User user=userService.checkUser(name,password);
        System.out.println(user.toString());
    }


}
