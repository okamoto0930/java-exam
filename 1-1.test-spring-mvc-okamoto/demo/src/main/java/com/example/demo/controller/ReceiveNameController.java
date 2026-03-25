package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.ReceiveNameForm;


@Controller
@RequestMapping("/receive-controller")
public class ReceiveNameController {
    
    //フォームオブジェクトをrequestスコープに格納
    @ModelAttribute
    public ReceiveNameForm seuUpform(){
        return new ReceiveNameForm();
    }

    @RequestMapping("")
    public String index(){
        return "name-form";
    }

        @RequestMapping("/form")
        public String form(ReceiveNameForm receiveNameForm){
            System.out.println("名前は"+receiveNameForm.getName()+"です");
            System.out.println("年齢は"+receiveNameForm.getAge());
            return "finished";
        
         }
}
