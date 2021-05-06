package com.example.myshop.dao;

import com.example.myshop.bean.Order;
import com.example.myshop.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderMapper {
    void addorder(String name,String num,String price,String total,String user,String picture,String address);
    List<Order> selectAllorder();
    void updateOrderbyid(String id,String address,String status);
    Order selectbyid(String id);
    List<Order> selectbyuserandstatus(String user,String status);
    List<Order> selectorderByidandstatus(String id, String status);
    List<Order> hotitem();
    void deleteOrder(String id);
    Order countorder();
    Order counttotal();

}
