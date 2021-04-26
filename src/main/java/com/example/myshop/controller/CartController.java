package com.example.myshop.controller;

import com.example.myshop.bean.Cart;
import com.example.myshop.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping()
public class CartController {
    @Autowired
    CartService cartService;
    @RequestMapping("/cart")
    public String cartPage(HttpSession session, ModelMap modelMap) {
        String user=session.getAttribute("user").toString();
        List<Cart> carts=cartService.selectbyuser(user);
        modelMap.addAttribute("cart",carts);
        return "cart";
    }
}
