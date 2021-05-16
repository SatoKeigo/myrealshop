package com.example.myshop.controller;

import com.example.myshop.bean.Item;
import com.example.myshop.bean.User;
import com.example.myshop.service.ItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping()
public class TypeController {
    @Autowired
    ItemService itemService;
    @RequestMapping("/type")
    public String typePage(@RequestParam(required = false,defaultValue = "1",value = "pagenum")int pagenum,@RequestParam(value = "type",defaultValue = "false")String type, ModelMap modelMap) {
        if(type.equals("false")){
            PageHelper.startPage(pagenum, 12);
            List<Item> items=itemService.showAllItem();
            List<Item> types=itemService.selectType();
            PageInfo pageInfo = new PageInfo(items);
            modelMap.addAttribute("pageInfo", pageInfo);
            modelMap.addAttribute("flag",type);
            modelMap.addAttribute("type",types);
            return "type";
        }
        else {
            PageHelper.startPage(pagenum, 12);
            List<Item> items=itemService.selectItemByType(type);
            List<Item> types=itemService.selectType();
            PageInfo pageInfo = new PageInfo(items);
            modelMap.addAttribute("pageInfo", pageInfo);
            modelMap.addAttribute("flag",type);
            modelMap.addAttribute("type",types);
            return "type";
        }

    }

}
