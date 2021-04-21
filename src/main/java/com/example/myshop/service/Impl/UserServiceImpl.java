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
    public List<User> selectUserByNameandType(String name, String type) {
        List<User> user=userMapper.selectUserByNameandType(name,type);
        return user;
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public void updateUserName(String name,String password,String type) {
        userMapper.updateUserName(name,password,type);
    }
}
