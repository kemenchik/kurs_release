package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {


    @GetMapping
    @RequestMapping("/")
    public String mainPage(){
        return "main";
    }

    @GetMapping
    @RequestMapping("/cabinet")
    public String cabinet(){
        return "cabinet";
    }

    @GetMapping
    @RequestMapping("/works")
    public String worksPage(){
        return "works";
    }

}
