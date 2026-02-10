package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam02-controller")
public class Exam02Controller {
    
    @Autowired
    private HttpSession sesstion;

    @RequestMapping("")
    public String Login(){
        return "exam02";
    }

    @RequestMapping("/form")
    public String Form(){

        session.Atrib
    }
}
