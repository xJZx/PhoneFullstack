package com.example.phonefullstack.controller;

import com.example.phonefullstack.model.User;
import com.example.phonefullstack.repository.UserRepository;
import com.example.phonefullstack.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

//    @GetMapping("/login")
//    public String loginPage(){
//
//        return "/login";
//    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, HttpSession session){
        User user = userRepository.findByEmail(email);

        if (user != null && user.getPassword().equals(password)){
            session.setAttribute("user", user);
            System.out.println("Logged in!");
            return "profile";
        }
        else {
            System.out.println("Error!");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }
}
