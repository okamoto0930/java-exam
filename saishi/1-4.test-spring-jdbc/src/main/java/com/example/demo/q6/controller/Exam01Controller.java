package com.example.demo.q6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01controller")
public class Exam01Controller {

    @RequestMapping("/login")
    public String Login(){
        return "exam01";
    }
    @RequestMapping("")
    public String Pass(){
        
    }
}
