package com.example.myshop.controller;

import com.example.myshop.bean.Cart;
import com.example.myshop.service.CartService;
import com.example.myshop.service.ItemService;
import com.example.myshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping()
public class CartController {
    @Autowired
    CartService cartService;
    @Autowired
    OrderService orderService;
    @Autowired
    ItemService itemService;
    @RequestMapping("/cart")
    public String cartPage(HttpSession session, ModelMap modelMap) {
        String user=session.getAttribute("user").toString();
        List<Cart> carts=cartService.selectbyuser(user);
        modelMap.addAttribute("cart",carts);
        return "cart";
    }
    @RequestMapping("/cartdelete")
    public String cartPage2(Integer id,HttpSession session, ModelMap modelMap) {
        cartService.cartdelete(id);
        return "redirect:/cart";
    }
    @RequestMapping("/cartsubmit")
    public String cartPage3(@RequestBody String[] myarray, HttpSession session, ModelMap modelMap) {
        for (String id : myarray) {
            Cart cart=cartService.selectbyid(id);
            String name=cart.getName();
            String address=cart.getAddress();
            String picture=cart.getPicture();
            String num =cart.getNum().toString();
            String price=cart.getPrice().toString();
            String total = cart.getTotal().toString();
            String user=session.getAttribute("user").toString();
            orderService.addorder(name,num,price,total,user,picture,address);
            itemService.updateitemnum(name,num);
            Integer id2=Integer.valueOf(id);
            cartService.cartdelete(id2);
        }
        return "redirect:/cart";
    }
}
