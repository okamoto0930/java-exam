package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam02controller")
public class Exam02Controller {
    
    @RequestMapping("")
    public String answerform(){
        return "exam02";
    }

    @Autowired
    private HttpSession session;

    @RequestMapping("/result")
    public String result(Integer num1, Integer num2, HttpSession session){

        Integer answer =num1+num2;
        String totalanswer =num1 + " + " + num2 + " = " + answer;

        session.setAttribute("num1",num1);
        session.setAttribute("num2", num2);
        session.setAttribute("answer", answer);
        session.setAttribute("totalanswer", totalanswer);
        return "exam02-result";
    }

    @RequestMapping("/next")
    public String next(){
        return "exam02-result2";
    }

}
