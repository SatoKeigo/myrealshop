package com.example.myshop.service;

import com.example.myshop.bean.Item;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ItemService {
    List<Item> showAllItem();
    List<Item> selectItemByName(String name);
    List<Item> showAllItem10();
    List<Item> selectItemByType(String type);
    List<Item> selectItemByType7(String type);
    List<Item> selectItemByNameandType(String name,String type);
    Item selectItemById(String id);
    void deleteItemById(Integer id);
    void updateItemName(String name,Double price,String type,Integer num);
}
