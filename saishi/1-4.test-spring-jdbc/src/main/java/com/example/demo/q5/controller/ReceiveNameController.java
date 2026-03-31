package com.example.demo.q5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/receive-name")
public class ReceiveNameController {

    @RequestMapping("")
    public String Form(){
        return "name-form";
    }

    @RequestMapping("/receive-form")
    public String ReceiveForm(ReceiveNameForm form){
    System.out.println("入力された名前は"+form.getName());
    return "finished";
    }

}
