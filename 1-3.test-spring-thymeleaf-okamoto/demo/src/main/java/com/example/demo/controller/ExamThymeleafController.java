package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/examthymeleafcontroller")
public class ExamThymeleafController {
    
    @RequestMapping("")
    public String index(String name, String age, String hobby, Model model){

            List<String> form=new ArrayList<>();

            form.add(name);
            form.add(age);
            form.add(hobby);

            model.addAttribute("form", form);
            return "ex-thymeleaf-result";
            
    }
}
