package com.example.myshop.service.Impl;

import com.example.myshop.bean.Order;
import com.example.myshop.dao.OrderMapper;
import com.example.myshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Override
    public void addorder(String name, String num, String price, String total, String user, String picture,String address) {
        orderMapper.addorder(name, num, price, total, user, picture,address);
    }

    @Override
    public List<Order> selectAllorder() {
        List<Order> orders=orderMapper.selectAllorder();
        return orders;
    }

    @Override
    public void updateOrderbyid(String id,String address,String status) {
        orderMapper.updateOrderbyid(id,address,status);
    }

    @Override
    public Order selectbyid(String id) {
        Order order=orderMapper.selectbyid(id);
        return order;
    }

    @Override
    public List<Order> selectorderByidandstatus(String id, String status) {
        List<Order> orders=orderMapper.selectorderByidandstatus(id,status);
        return orders;
    }

    @Override
    public void deleteOrder(String id) {
        orderMapper.deleteOrder(id);
    }

    @Override
    public List<Order> selectbyuserandstatus(String user,String status) {
        List<Order> orders=orderMapper.selectbyuserandstatus(user,status);
        return orders;
    }

    @Override
    public List<Order> hotitem() {
        List<Order> orders=orderMapper.hotitem();
        return orders;
    }

    @Override
    public Order countorder() {
        Order order=orderMapper.countorder();
        return order;
    }

    @Override
    public Order counttotal() {
        Order order=orderMapper.counttotal();
        return order;
    }

    @Override
    public void payOrderbyid(String id) {
        orderMapper.payOrderbyid(id);
    }

    @Override
    public void confirmOrderbyid(String id) {
        orderMapper.confirmOrderbyid(id);
    }
}
