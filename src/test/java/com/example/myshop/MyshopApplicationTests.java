package com.example.myshop;

import com.example.myshop.bean.Item;
import com.example.myshop.bean.Order;
import com.example.myshop.bean.User;
import com.example.myshop.service.ItemService;
import com.example.myshop.service.OrderService;
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
    @Autowired
    private OrderService orderService;
    @Test
    void contextLoads() {
        System.out.println(orderService.countorder().getId());
    }


}
