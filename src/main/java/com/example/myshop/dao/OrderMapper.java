package com.example.myshop.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrderMapper {
    void addorder(String name,String num,String price,String total,String user,String picture,String address);
}
