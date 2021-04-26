package com.example.myshop.service;
import com.example.myshop.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User checkUser(String name,String password);
    List<User> showAllUser();
    List<User> selectUserByName(String name);
    List<User> selectUserByType(String type);
    User selectUserByName2(String name);
    List<User> selectUserByNameandType(String name,String type);
    void adduser(String name,String password);
    void deleteUserById(Integer id);
    void updateUserName2(String name,String sex,String email,String phone);
    void updateUserName(String name,String password,String type);
}
