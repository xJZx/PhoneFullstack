package com.example.phonefullstack.controller;

import com.example.phonefullstack.model.User;
import com.example.phonefullstack.service.PhoneService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
    @Autowired
    private PhoneService phoneService;

    @GetMapping("/profile")
    public String profile(){

        return "profile";
    }

//    @GetMapping("/profile")
//    public String profile(HttpSession session){
//        User user = (User) session.getAttribute("user");
//
//        if (user != null){
//            System.out.println("git");
//            return "profile";
//        }
//        else {
//            System.out.println("lol");
//            return "login";
//        }
//    }
}
