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
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
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
    @RequestMapping("/additem")
    public String updateitem(){

        return "admin/additem";
    }
    @RequestMapping("/toadditem")
    public String additem(@RequestParam("radio10")String type, @RequestParam("name")String name, @RequestParam("price")Double price, @RequestParam("num")Integer num, @RequestParam("picture") MultipartFile file, HttpServletRequest request, @RequestParam(required = false,defaultValue = "1",value = "pagenum")int pagenum, ModelMap modelMap){
        String filename=file.getOriginalFilename();
        String picture2="img/icon/"+filename;
        System.out.println(picture2);
        File file1=new File("C:\\Users\\Dell\\IdeaProjects\\myshop\\src\\main\\resources\\static\\img\\icon\\"+filename);
        try {
            file.transferTo(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        itemService.additem(name, price, num, picture2, type);
        PageHelper.startPage(pagenum, 5);
        List<Item> items=itemService.showAllItem();
        PageInfo pageInfo = new PageInfo(items);
        modelMap.addAttribute("pageInfo", pageInfo);
        return "admin/item";
    }
}
