package com.example.myshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class OrderController {
    @RequestMapping("/order")
    public String userPage() {
        return "admin/order";
    }
}
