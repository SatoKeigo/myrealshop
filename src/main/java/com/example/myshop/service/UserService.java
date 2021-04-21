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
    List<User> selectUserByNameandType(String name,String type);
    void deleteUserById(Integer id);
    void updateUserName(String name,String password,String type);
}
