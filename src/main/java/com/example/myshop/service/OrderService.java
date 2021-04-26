package com.example.myshop.service;

import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    void addorder(String name,String num,String price,String total,String user,String picture,String address);
}
