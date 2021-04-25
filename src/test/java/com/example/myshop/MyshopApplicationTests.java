package com.example.myshop;

import com.example.myshop.bean.Item;
import com.example.myshop.bean.User;
import com.example.myshop.service.ItemService;
import com.example.myshop.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MyshopApplicationTests {
    @Autowired
    private UserService userService;
    @Autowired
    private ItemService itemService;
    @Test
    void contextLoads() {
        userService.adduser("z","z");

    }


}
