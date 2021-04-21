package com.example.myshop.controller;

import com.example.myshop.bean.User;
import com.example.myshop.service.UserService;
import com.example.myshop.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping()
    public String loginPage() {
        return "admin/login";
    }
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session, RedirectAttributes attributes,
                        HttpServletRequest request) {
        User user=userService.checkUser(username,password);
        if (user!=null) {
            session.setAttribute("user",user);
            if (!CodeUtil.checkVerifyCode(request)) {
                attributes.addFlashAttribute("message","验证码错误");
                return "redirect:/admin";
            } else {
                return "/admin/index";
            }
        }else {
            session.removeAttribute("user");
            attributes.addFlashAttribute("message","用户名或密码错误");
            return "redirect:/admin";

        }

    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/admin";
    }

}
