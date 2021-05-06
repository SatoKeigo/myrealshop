package com.example.myshop.controller;

import com.example.myshop.bean.Order;
import com.example.myshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class dingdanController {
    @Autowired
    OrderService orderService;
    @RequestMapping("/dingdan")
    public String dingdanxPage(HttpSession session, ModelMap modelMap) {
        String user = session.getAttribute("user").toString();
        List<Order> orders1=orderService.selectbyuserandstatus(user,"1");
        List<Order> orders2=orderService.selectbyuserandstatus(user,"2");
        List<Order> orders3=orderService.selectbyuserandstatus(user,"3");
        List<Order> orders4=orderService.selectbyuserandstatus(user,"4");
        modelMap.addAttribute("order1",orders1);
        modelMap.addAttribute("order2",orders2);
        modelMap.addAttribute("order3",orders3);
        modelMap.addAttribute("order4",orders4);
        return "dingdan";
    }
}
