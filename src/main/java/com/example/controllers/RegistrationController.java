package com.example.controllers;

//import kurs.demo.entities.User;
//import kurs.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

//    @Autowired
//    private UserService userService;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", "new User()");

        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(Model model) {

//        userService.saveUser(user);


        return "redirect:/login";
    }
}
