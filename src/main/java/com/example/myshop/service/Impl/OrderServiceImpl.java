package com.example.myshop.service.Impl;

import com.example.myshop.dao.OrderMapper;
import com.example.myshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Override
    public void addorder(String name, String num, String price, String total, String user, String picture,String address) {
        orderMapper.addorder(name, num, price, total, user, picture,address);
    }
}
