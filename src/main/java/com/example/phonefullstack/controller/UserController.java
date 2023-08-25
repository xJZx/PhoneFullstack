package com.example.phonefullstack.controller;

import com.example.phonefullstack.model.User;
import com.example.phonefullstack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String user(Model model){
        model.addAttribute("user", new User());
        return "user";
    }

    @PostMapping("/register")
    public String login(@ModelAttribute User user, Model model){
//        saveUser() - saving to DB
        userService.saveUser(user);
        System.out.println(user.toString());
        return "index";
    }
}
