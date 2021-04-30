package com.example.myshop.controller;

import com.example.myshop.bean.User;
import com.example.myshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
@Controller
public class InfoController {

    @Autowired
    private UserService userService;
    @RequestMapping("/info")
    public String infoPage(HttpSession session, ModelMap modelMap) {
        String name = session.getAttribute("user").toString();
        User user=userService.selectUserByName2(name);
        modelMap.addAttribute("user",user);
        return "info";
    }
    @RequestMapping("/updateuser")
    public String updateuser(HttpSession session, ModelMap modelMap, @RequestParam("name")String name, @RequestParam("radio10")String sex, @RequestParam("phone")String phone, @RequestParam("email")String email,@RequestParam("address")String address) {
        userService.updateUserName2(name,sex,phone,email,address);
        User user=userService.selectUserByName2(name);
        modelMap.addAttribute("user",user);
        return "info";
    }
}
