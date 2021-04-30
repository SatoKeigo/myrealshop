package com.example.myshop.controller;

import com.example.myshop.bean.Item;
import com.example.myshop.bean.Order;
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
@RequestMapping("/admin")
public class ItemController {
    @Autowired
    ItemService itemService;
    @RequestMapping("/item")
    public String itemPage(@RequestParam(required = false,defaultValue = "1",value = "pagenum")int pagenum, ModelMap modelMap) {
        PageHelper.startPage(pagenum, 5);
        List<Item> items=itemService.showAllItem();
        PageInfo pageInfo = new PageInfo(items);
        modelMap.addAttribute("pageInfo", pageInfo);
        return "admin/item";
    }
    @RequestMapping("/query3")
    public String queryuserPage(@RequestParam(required = false,defaultValue = "1",value = "pagenum")int pagenum, ModelMap modelMap,@RequestParam(value = "id",defaultValue = "null")String id,@RequestParam(value = "name",defaultValue = "null")String name) {
        if(id.equals("null"))
        {id=null;}
        if(name.equals("null"))
        {name=null;}
        PageHelper.startPage(pagenum, 5);
        List<Item> items=itemService.selectItemByidandname(name, id);
        PageInfo pageInfo = new PageInfo(items);
        modelMap.addAttribute("pageInfo", pageInfo);

        return "admin/item";
    }
    @RequestMapping("/delete3")
    public String deleteitemPage(@RequestParam(required = false,defaultValue = "1",value = "pagenum")int pagenum, ModelMap modelMap,@RequestParam("id")Integer id) {
        itemService.deleteItemById(id);
        PageHelper.startPage(pagenum, 5);
        List<Item> items=itemService.showAllItem();
        PageInfo pageInfo = new PageInfo(items);
        modelMap.addAttribute("pageInfo", pageInfo);
        return "admin/item";
    }
    @RequestMapping("/updateitem")
    public String updateitem(ModelMap modelMap,String id){
        Item item=itemService.selectItemById(id);
        modelMap.addAttribute("item",item);
        return "admin/updateitem";
    }
    @RequestMapping("/update3")
    public String update(Integer id,String name,Double price,Integer num,String picture,@RequestParam(required = false,defaultValue = "1",value = "pagenum")int pagenum, ModelMap modelMap){
        itemService.updateItemName(name, price, id, num,picture);
        PageHelper.startPage(pagenum, 5);
        List<Item> items=itemService.showAllItem();
        PageInfo pageInfo = new PageInfo(items);
        modelMap.addAttribute("pageInfo", pageInfo);
        return "admin/item";
    }
}
