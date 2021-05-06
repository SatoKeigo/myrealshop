package com.example.myshop.controller;

import com.example.myshop.bean.Item;
import com.example.myshop.bean.User;
import com.example.myshop.service.CartService;
import com.example.myshop.service.ItemService;
import com.example.myshop.service.OrderService;
import com.example.myshop.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping()
public class Item2Controller {
    @Autowired
    ItemService itemService;
    @Autowired
    UserService userService;
    @Autowired
    CartService cartService;
    @Autowired
    OrderService orderService;
    @RequestMapping("/item/{id}")
    public String item2Page(@PathVariable String id, ModelMap modelMap) {
        Item items=itemService.selectItemById(id);
        modelMap.addAttribute("item",items);
        return "item";
    }
    @RequestMapping("/buy")
    public String buyPage(HttpSession session,@RequestParam("name")String name, @RequestParam("picture")String picture, @RequestParam("num")String num, @RequestParam("price")String price, @RequestParam("total")String total, ModelMap modelMap) {
        String user=session.getAttribute("user").toString();
        String address=userService.selectUserByName2(user).getAddress();
        orderService.addorder(name,num,price,total,user,picture,address);
        itemService.updateitemnum(name,num);
        return "redirect:/index";
    }
    @RequestMapping("/addcart")
    public String addcartPage(HttpSession session,@RequestParam("name")String name, @RequestParam("picture")String picture, @RequestParam("num")String num, @RequestParam("price")String price, @RequestParam("total")String total, ModelMap modelMap) {
        String user=session.getAttribute("user").toString();
        String address=userService.selectUserByName2(user).getAddress();
        cartService.addcart(name,num,price,total,user,picture,address);
        return "redirect:/index";
    }

}
