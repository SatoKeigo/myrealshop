package com.example.myshop.service;

import com.example.myshop.bean.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    void addorder(String name,String num,String price,String total,String user,String picture,String address);
    List<Order> selectAllorder();
    void updateOrderbyid(String id,String address,String status);
    Order selectbyid(String id);
    List<Order> selectorderByidandstatus(String id, String status);
    void deleteOrder(String id);
    List<Order> selectbyuserandstatus(String user,String status);
    List<Order> hotitem();
    Order countorder();
    Order counttotal();
    void payOrderbyid(String id);
    void confirmOrderbyid(String id);
}
