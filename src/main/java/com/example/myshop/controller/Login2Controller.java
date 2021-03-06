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
                    return "redirect:/index";
                }
                else {
                    session.removeAttribute("user");
                    attributes.addFlashAttribute("message","??????????????????????????????");
                    return "redirect:/login";
                }
                }
            else {
                session.removeAttribute("user");
                attributes.addFlashAttribute("message","????????????????????????");
                return "redirect:/login";
                }

        }


    }

