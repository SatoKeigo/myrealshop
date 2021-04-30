package com.example.myshop.service.Impl;

import com.example.myshop.bean.User;
import com.example.myshop.dao.UserMapper;
import com.example.myshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User checkUser(String name, String password) {
        User user=userMapper.checkUser(name, password);
        return user;
    }

    @Override
    public List<User> showAllUser() {
        List<User> user=userMapper.showAllUser();
        return user;
    }

    @Override
    public List<User> selectUserByName(String name) {
        List<User> user=userMapper.selectUserByName(name);
        return user;
    }

    @Override
    public List<User> selectUserByType(String type) {
        List<User> user=userMapper.selectUserByType(type);
        return user;
    }

    @Override
    public User selectUserByName2(String name) {
        User user =userMapper.selectUserByName2(name);
        return user;
    }

    @Override
    public List<User> selectUserByNameandType(String name, String type) {
        List<User> users=userMapper.selectUserByNameandType(name,type);
        return users;
    }

    @Override
    public void adduser(String name, String password) {
        userMapper.adduser(name,password);
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public void updateUserName2(String name, String sex, String email, String phone,String address) {
        userMapper.updateUserName2(name,sex,email,phone,address);
    }

    @Override
    public void updateUserName(String name,String password,String type) {
        userMapper.updateUserName(name,password,type);
    }
}
