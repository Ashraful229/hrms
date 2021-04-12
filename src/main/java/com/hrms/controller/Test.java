package com.hrms.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/" })
public class Test {

    @GetMapping("test")
    public String test(){
        return "view/dashboard";
    }
}
