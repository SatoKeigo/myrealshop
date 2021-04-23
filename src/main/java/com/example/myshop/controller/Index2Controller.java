package com.example.myshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Index2Controller {
    @RequestMapping("/index")
    public String indexPage() {
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
