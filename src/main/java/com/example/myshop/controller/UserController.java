package com.example.myshop.controller;

import com.example.myshop.bean.User;
import com.example.myshop.service.UserService;
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
@RequestMapping("/admin")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/user")
    public String userPage(@RequestParam(required = false,defaultValue = "1",value = "pagenum")int pagenum, ModelMap modelMap) {
        PageHelper.startPage(pagenum, 5);
        List<User> users=userService.showAllUser();
        PageInfo pageInfo = new PageInfo(users);
        modelMap.addAttribute("pageInfo", pageInfo);

        return "admin/user";
    }
    @RequestMapping("/query")
    public String queryuserPage(@RequestParam(required = false,defaultValue = "1",value = "pagenum")int pagenum, ModelMap modelMap,@RequestParam(value = "name",defaultValue = "null")String name,@RequestParam(value = "type",defaultValue = "null")String type) {
        if(name.equals("null"))
        {name=null;}
        if(type.equals("null"))
        {type=null;}
                PageHelper.startPage(pagenum, 5);
        List<User> users=userService.selectUserByNameandType(name,type);
        PageInfo pageInfo = new PageInfo(users);
        modelMap.addAttribute("pageInfo", pageInfo);

        return "admin/user";
    }
    @RequestMapping("/delete")
    public String deleteuserPage(@RequestParam(required = false,defaultValue = "1",value = "pagenum")int pagenum, ModelMap modelMap,@RequestParam("id")Integer id) {
        userService.deleteUserById(id);
        PageHelper.startPage(pagenum, 5);
        List<User> users=userService.showAllUser();
        PageInfo pageInfo = new PageInfo(users);
        modelMap.addAttribute("pageInfo", pageInfo);

        return "admin/user";
    }
    @RequestMapping("/toupdate")
    public String toupdateuserPage(ModelMap modelMap,String name) {
        List<User> users=userService.selectUserByName(name);
        modelMap.put("users",users);
        return "admin/userupdate";
    }
    @RequestMapping("/update")
    public String updateuserPage(String name,String password,String type,@RequestParam(required = false,defaultValue = "1",value = "pagenum")int pagenum, ModelMap modelMap) {
        userService.updateUserName(name,password,type);
        PageHelper.startPage(pagenum, 5);
        List<User> users=userService.showAllUser();
        PageInfo pageInfo = new PageInfo(users);
        modelMap.addAttribute("pageInfo", pageInfo);
        return "admin/user";
    }

}
