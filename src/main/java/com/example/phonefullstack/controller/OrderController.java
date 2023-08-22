package com.example.phonefullstack.controller;

import com.example.phonefullstack.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
    @Autowired
    private PhoneService phoneService;

    @GetMapping("/order")
    public String order(){

        return "/order";
    }


    // nie działa, pisze że już jest dodane
//    @RequestMapping("/index")
//    public String index(){
//
//        return "/index";
//    }

//    @RequestMapping("/cart")
//    public String cart(){
//
//        return "/cart";
//    }


}
