package com.hu.crn.crmhu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("order")
public class CourseOrderController {

    @RequestMapping("/list")
    public String list(){

        System.out.println("跳转到list页面");
        return "courseorder/list";
    }
}
