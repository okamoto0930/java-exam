package com.example.test_spring_mvc_okamoto.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class ReceiveNameController {
    
    @RequestMapping("")
    public String Nameform(){
        return "name-form";
    }

    @RequestMapping("/nameform")
    public String Finishe(){
        
        return "finished";
    }
}
