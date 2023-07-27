package com.example.phonefullstack.controller;

import com.example.phonefullstack.model.Phone;
import com.example.phonefullstack.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
    @Autowired
    private PhoneService phoneService;

    @GetMapping("/cart")
    public String cart(){

        return "cart";
    }

    @RequestMapping("/index")
    public String index(){

        return "index";
    }

    @PostMapping("/order")
    public String order(@ModelAttribute Phone phone){
        phoneService.savePhone(phone);
        System.out.println(phone.toString());
        return "index";
    }
}
