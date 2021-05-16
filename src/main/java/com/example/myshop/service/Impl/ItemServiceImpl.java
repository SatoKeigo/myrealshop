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
        return items;
    }

    @Override
    public List<Item> showAllItem10() {
        List<Item> items=itemMapper.showAllItem10();
        return items;
    }

    @Override
    public List<Item> selectItemByType(String type) {
        List<Item> items=itemMapper.selectItemByType(type);
        return items;
    }
    @Override
    public List<Item> selectItemByType7(String type) {
        List<Item> items=itemMapper.selectItemByType7(type);
        return items;
    }

    @Override
    public List<Item> selectItemByidandname(String name, String id) {
        List<Item> items=itemMapper.selectItemByidandname(name,id);
        return items;
    }

    @Override
    public Item selectItemById(String id) {
        Item items=itemMapper.selectItemById(id);
        return items;
    }

    @Override
    public void deleteItemById(Integer id) {
        itemMapper.deleteItemById(id);
    }

    @Override
    public void additem(String name, Double price, Integer num, String picture, String type,String comment) {
        itemMapper.additem(name, price, num, picture, type, comment);
    }

    @Override
    public void updateItemName(String name, Double price, Integer id, Integer num,String picture) {
        itemMapper.updateItemName(name, price, id, num,picture);
    }

    @Override
    public void updateitemnum(String name,String num) {
        itemMapper.updateitemnum(name,num);
    }

    @Override
    public List<Item> selectType() {
        List<Item> items=itemMapper.selectType();
        return items;
    }


}
