package com.example.myshop.dao;

import com.example.myshop.bean.Cart;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CartMapper {
    List<Cart> selectbyuser(String user);
    void addcart(String name,String num,String price,String total,String user,String picture,String address);
}
