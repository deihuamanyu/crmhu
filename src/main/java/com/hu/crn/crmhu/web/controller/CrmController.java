package com.hu.crn.crmhu.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main")
public class CrmController {

    @RequestMapping("index")
    public String  index(){

        System.out.println("国庆70周年");
        return "index";
    }
}
