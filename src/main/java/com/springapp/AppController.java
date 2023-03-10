package com.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //This allows methods inside the class to be used as rest endpoints
@RequestMapping("app")
//@Controller
public class AppController {
    @Autowired
    private UserRepository userRepo;

    @GetMapping("home")
//    @ResponseBody
    public String viewHomePage(){
        return "home";
    }

//    @GetMapping("/register")
//    public String showRegistrationForm(Model model) {
//        model.addAttribute("user", new User());
//        return "signup_form";
//    }

    @GetMapping//("/users")
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
