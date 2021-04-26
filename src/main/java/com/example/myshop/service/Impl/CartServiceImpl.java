package com.example.myshop.service.Impl;

import com.example.myshop.bean.Cart;
import com.example.myshop.dao.CartMapper;
import com.example.myshop.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartMapper cartMapper;
    @Override
    public List<Cart> selectbyuser(String user) {
        List<Cart> carts=cartMapper.selectbyuser(user);
        return carts;
    }

    @Override
    public void addcart(String name, String num, String price, String total, String user, String picture, String address) {
        cartMapper.addcart(name,num,price,total,user,picture,address);
    }
}
