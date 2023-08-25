package com.example.phonefullstack.controller;

import com.example.phonefullstack.model.Phone;
import com.example.phonefullstack.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private PhoneService phoneService;

    @GetMapping("/")
    public String index(){

        return "index";
    }

    @RequestMapping("/cart")
    public String cart(){

        return "cart";
    }

    @RequestMapping("/user")
    public String user(){

        return "user";
    }

//    @PostMapping("/order")
//    public String order(@ModelAttribute Phone phone){
//        System.out.println(phone.toString());
//        return "index";
//    }

    @PostMapping("/add")
    public String add(@RequestBody Phone phone){
        phoneService.savePhone(phone);
        return "New phone was added";
    }

    @GetMapping("/getAll")
    public List<Phone> getAllPhones(){
        return phoneService.getAllPhones();
    }
}
