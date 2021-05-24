package com.example.controllers;

import com.example.entities.User;
import com.example.repos.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

    @Autowired
    private RegisterRepo registerRepo;

    @GetMapping
    @RequestMapping("/")
    public String mainPage(){
        return "main";
    }

    @GetMapping
    @RequestMapping("/cabinet")
    public String cabinet(@AuthenticationPrincipal User user, Model model){
        model.addAttribute("user", user);
        model.addAttribute("registers", registerRepo.findAllByUser(user));
        return "cabinet";
    }

    @GetMapping
    @RequestMapping("/works")
    public String worksPage(){
        return "works";
    }

    @GetMapping
    @RequestMapping("/main")
    public String main(){
        return "main";
    }
}
