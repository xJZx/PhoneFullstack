package com.example.phonefullstack.controller;

import com.example.phonefullstack.model.User;
import com.example.phonefullstack.repository.UserRepository;
import com.example.phonefullstack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/registration")
    public String user(Model model){
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user, Model model){
//        checking if the user already exist in the DB
        if (userRepository.findByEmail(user.getEmail()) != null){
            return "registration";
        }
//        saveUser() - saving to DB
        userService.saveUser(user);
        System.out.println(user.toString());
        return "login";
    }
}
