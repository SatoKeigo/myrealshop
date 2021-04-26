package com.example.myshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dingdanController {
    @RequestMapping("/dingdan")
    public String dingdanxPage() {

        return "dingdan";
    }
}
