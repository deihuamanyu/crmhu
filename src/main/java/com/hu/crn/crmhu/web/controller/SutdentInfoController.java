package com.hu.crn.crmhu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class SutdentInfoController {
    @RequestMapping("list")
    public String list(){
        System.out.println("跳转到student的list页面");
        return "studentinfo/list";
    }
}
