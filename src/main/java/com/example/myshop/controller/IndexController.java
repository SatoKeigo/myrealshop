package com.example.myshop.controller;

import com.example.myshop.bean.Order;
import com.example.myshop.service.ItemService;
import com.example.myshop.service.OrderService;
import com.example.myshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class IndexController {
    @Autowired
    UserService userService;
    @Autowired
    OrderService orderService;
    @Autowired
    ItemService itemService;
    @RequestMapping("/index")
    public String indexPage(ModelMap modelMap) {
        List<Order> orders=orderService.hotitem();
        Integer integer=orderService.countorder().getId();
        Double total = orderService.counttotal().getTotal();
        String usertotal = userService.countuser().getName();
        Order order1=orders.get(0);
        Order order2=orders.get(1);
        Order order3=orders.get(2);
        Order order4=orders.get(3);
        Order order5=orders.get(4);
        modelMap.addAttribute("ordernum",integer);
        modelMap.addAttribute("ordertotal",total);
        modelMap.addAttribute("usertotal",usertotal);
        modelMap.addAttribute("order1",order1);
        modelMap.addAttribute("order2",order2);
        modelMap.addAttribute("order3",order3);
        modelMap.addAttribute("order4",order4);
        modelMap.addAttribute("order5",order5);
        return "admin/index";
    }
}
