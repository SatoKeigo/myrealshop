package com.example.myshop.controller;

import com.example.myshop.bean.Item;
import com.example.myshop.bean.User;
import com.example.myshop.service.ItemService;
import com.example.myshop.service.UserService;
import com.example.myshop.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping()
public class Login2Controller {
    @Autowired
    private UserService userService;
    @Autowired
    ItemService itemService;
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
    @RequestMapping("/adduser")
    public String add(@RequestParam("uname") String username,
                      @RequestParam("upwd") String password){
        userService.adduser(username,password);
        System.out.println(username);
        return "login";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "index";
    }


    @RequestMapping("/logincheck")
    public String loginchek(@RequestParam("uname") String username,
                            @RequestParam("upwd") String password,
                            HttpSession session, RedirectAttributes attributes,
                            HttpServletRequest request, ModelMap modelMap) {

        User user=userService.checkUser(username,password);

            if (user!=null) {
                if(user.getType().equals("1")){
                    session.setAttribute("user",user.getName());
                    modelMap.addAttribute("user",user.getName());
                    List<Item> items1=itemService.showAllItem10();
                    List<Item> items2=itemService.selectItemByType7("a");
                    List<Item> items3=itemService.selectItemByType7("b");
                    List<Item> items4=itemService.selectItemByType7("c");
                    List<Item> items5=itemService.selectItemByType7("d");
                    modelMap.addAttribute("hot",items1);
                    modelMap.addAttribute("a",items2);
                    modelMap.addAttribute("b",items3);
                    modelMap.addAttribute("c",items4);
                    modelMap.addAttribute("d",items5);
                    return "index";
                }
                else {
                    session.removeAttribute("user");
                    attributes.addFlashAttribute("message","请不要使用管理员登录");
                    return "redirect:/login";
                }
                }
            else {
                session.removeAttribute("user");
                attributes.addFlashAttribute("message","用户名或密码错误");
                return "redirect:/login";
                }

        }


    }

