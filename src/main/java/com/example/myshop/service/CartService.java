package com.example.myshop.service;

import com.example.myshop.bean.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {
    List<Cart> selectbyuser(String user);
    void addcart(String name,String num,String price,String total,String user,String picture,String address);
    void cartdelete(Integer id);
    Cart selectbyid(String id);
}
