package com.example.myshop.controller;

import com.example.myshop.bean.Item;
import com.example.myshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller

public class Index2Controller {
    @Autowired
    ItemService itemService;
    @RequestMapping("/index")
    public String indexPage(ModelMap modelMap, HttpSession session) {

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
        modelMap.addAttribute("user",session.getAttribute("user"));
        return "index";
    }
    @RequestMapping("/about")
    public String aboutPage() {
        return "about";
    }

    @RequestMapping("/cart")
    public String cartPage() {
        return "cart";
    }
    @RequestMapping("/dingdan")
    public String dingdanxPage() {
        return "dingdan";
    }
    @RequestMapping("/info")
    public String infoPage() {
        return "info";
    }
    

}
