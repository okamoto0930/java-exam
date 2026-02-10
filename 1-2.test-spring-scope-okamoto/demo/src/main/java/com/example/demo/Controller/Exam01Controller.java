package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01-controller")
public class Exam01Controller {
    
    @RequestMapping("")
    public String Form(){
        return "exam01";
    }

    @RequestMapping("/login")
    public String Login(String mail, String password, Model model){
        String result;

    if(mail.equals("yamada@sample.com") && password.equals("yamayama")){
        result ="「成功」";
    }
    else{
        result ="「失敗」";
    }
    
    model.addAttribute("result", result);
    return "exam01form";
    
    }

}
