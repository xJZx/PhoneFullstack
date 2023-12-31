package com.example.phonefullstack.controller;

import com.example.phonefullstack.model.Phone;
import com.example.phonefullstack.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
    @Autowired
    private PhoneService phoneService;

//    needed to add the model so th:object could resolve it
    @GetMapping("/cart")
    public String cart(Model model){
        model.addAttribute("phone", new Phone());
        return "cart";
    }

    @PostMapping("/order")
    public String order(@ModelAttribute Phone phone, Model model){
//        savePhone() - saving to DB
        phoneService.savePhone(phone);
        System.out.println(phone.toString());
        // na przekazanie do html atrybutu klasy
        model.addAttribute("id", phone.getPhone_id());
        model.addAttribute("color", phone.getColor());
        model.addAttribute("processor", phone.getProcessor());
        model.addAttribute("camera", phone.getCamera());
        model.addAttribute("battery", phone.getBattery());
        return "order";
    }
}
