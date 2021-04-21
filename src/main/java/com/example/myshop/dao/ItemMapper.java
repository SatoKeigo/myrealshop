package com.example.myshop.dao;

import com.example.myshop.bean.Item;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ItemMapper {

    List<Item> showAllItem();
    List<Item> selectItemByName(String name);
    List<Item> selectItemByType(String type);
    List<Item> selectItemByNameandType(String name,String type);
    void deleteItemById(Integer id);
    void updateItemName(String name,Double price,String type,Integer num);
}
