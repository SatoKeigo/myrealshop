package com.example.myshop.dao;

import com.example.myshop.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    User checkUser(String name, String password);
    List<User> showAllUser();
    List<User> selectUserByName(String name);
    User selectUserByName2(String name);
    List<User> selectUserByType(String type);
    List<User> selectUserByNameandType(String name,String type);
    void deleteUserById(Integer id);
    void adduser(String name,String password);
    void updateUserName2(String name,String sex,String email,String phone);
    void updateUserName(String name,String password,String type);
}
