package com.example.myshop.service.Impl;

import com.example.myshop.bean.Item;
import com.example.myshop.dao.ItemMapper;
import com.example.myshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemMapper itemMapper;
    @Override
    public List<Item> showAllItem() {
        List<Item> items=itemMapper.showAllItem();
        return items;
    }

    @Override
    public List<Item> selectItemByName(String name) {
        List<Item> items=itemMapper.selectItemByName(name);
        return null;
    }

    @Override
    public List<Item> selectItemByType(String type) {
        List<Item> items=itemMapper.selectItemByType(type);
        return null;
    }

    @Override
    public List<Item> selectItemByNameandType(String name, String type) {
        List<Item> items=itemMapper.selectItemByNameandType(name,type);
        return null;
    }

    @Override
    public void deleteItemById(Integer id) {
        itemMapper.deleteItemById(id);
    }

    @Override
    public void updateItemName(String name, Double price, String type, Integer num) {
        itemMapper.updateItemName(name,price,type,num);
    }
}
