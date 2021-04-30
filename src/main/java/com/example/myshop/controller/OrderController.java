package com.example.myshop.controller;

import com.example.myshop.bean.Order;
import com.example.myshop.bean.User;
import com.example.myshop.service.OrderService;
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
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping("/order")
    public String orderPage(@RequestParam(required = false,defaultValue = "1",value = "pagenum")int pagenum, ModelMap modelMap) {
        PageHelper.startPage(pagenum, 5);
        List<Order> orders=orderService.selectAllorder();
        PageInfo pageInfo = new PageInfo(orders);
        modelMap.addAttribute("pageInfo",pageInfo);
        return "admin/order";
    }
    @RequestMapping("/updateorder")
    public String updateorder(ModelMap modelMap,String id){
        Order order=orderService.selectbyid(id);
        modelMap.addAttribute("order",order);
        return "admin/updateorder";
    }
    @RequestMapping("/update2")
    public String update(String id,String status,String address,@RequestParam(required = false,defaultValue = "1",value = "pagenum")int pagenum, ModelMap modelMap){
        orderService.updateOrderbyid(id, address, status);
        PageHelper.startPage(pagenum, 5);
        List<Order> orders=orderService.selectAllorder();
        PageInfo pageInfo = new PageInfo(orders);
        modelMap.addAttribute("pageInfo",pageInfo);
        return "admin/order";
    }
    @RequestMapping("/query2")
    public String queryuserPage(@RequestParam(required = false,defaultValue = "1",value = "pagenum")int pagenum, ModelMap modelMap,@RequestParam(value = "id",defaultValue = "null")String id,@RequestParam(value = "status",defaultValue = "null")String status) {
        if(id.equals("null"))
        {id=null;}
        if(status.equals("null"))
        {status=null;}
        PageHelper.startPage(pagenum, 5);
        List<Order> orders=orderService.selectorderByidandstatus(id, status);
        PageInfo pageInfo = new PageInfo(orders);
        modelMap.addAttribute("pageInfo", pageInfo);

        return "admin/order";
    }
    @RequestMapping("/delete2")
    public String deleteuserPage(@RequestParam(required = false,defaultValue = "1",value = "pagenum")int pagenum, ModelMap modelMap,@RequestParam("id")String id) {
        orderService.deleteOrder(id);
        PageHelper.startPage(pagenum, 5);
        List<Order> orders=orderService.selectAllorder();
        PageInfo pageInfo = new PageInfo(orders);
        modelMap.addAttribute("pageInfo",pageInfo);
        return "admin/order";
    }
}
