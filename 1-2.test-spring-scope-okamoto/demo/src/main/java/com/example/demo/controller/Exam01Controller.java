package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01-controller")
public class Exam01Controller {
    
    @RequestMapping("")
    public String loginform(){
        return "exam01";
    }

    @RequestMapping("/result")
    public String result(String mail, String password, Model model){

        String answer;
        if(mail.equals("yamada@sample.com")&&password.equals("yamayama")){
            answer="成功";
        }else{
            answer="失敗";
        }

        model.addAttribute("answer", answer);
        
        return "loginresult01";
    }
}
