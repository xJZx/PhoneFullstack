package com.example.phonefullstack.controller;

import com.example.phonefullstack.model.Phone;
import com.example.phonefullstack.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phone")
public class PhoneController {
    @Autowired
    private PhoneService phoneService;

    @PostMapping("/order")
    public String order(@ModelAttribute Phone phone){

        return "index";
    }

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
