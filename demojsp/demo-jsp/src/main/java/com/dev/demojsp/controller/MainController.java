package com.dev.demojsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/")
    public String home(){
        System.out.println("this is home page");
        return "home";
    }
}
