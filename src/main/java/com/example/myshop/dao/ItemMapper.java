package com.example.myshop.dao;

import com.example.myshop.bean.Item;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ItemMapper {

    List<Item> showAllItem();
    List<Item> showAllItem10();
    List<Item> selectItemByName(String name);
    List<Item> selectItemByType(String type);
    List<Item> selectItemByType7(String type);
    List<Item> selectItemByidandname(String name,String id);
    Item selectItemById(String id);
    void deleteItemById(Integer id);
    void updateItemName(String name,Double price,Integer id,Integer num,String picture);
}
