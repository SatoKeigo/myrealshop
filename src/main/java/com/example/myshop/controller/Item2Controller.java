package com.example.myshop.controller;

import com.example.myshop.bean.Item;
import com.example.myshop.bean.User;
import com.example.myshop.service.ItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping()
public class Item2Controller {
    @Autowired
    ItemService itemService;
    @RequestMapping("/item/{id}")
    public String item2Page(@PathVariable String id, ModelMap modelMap) {
        Item items=itemService.selectItemById(id);
        modelMap.addAttribute("item",items);
        return "item";
    }
}
