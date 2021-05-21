package com.example.controllers;


//import kurs.demo.repos.EmployeeRepo;
//import kurs.demo.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

//    @Autowired
//    private UserRepo userRepo;
//
//    @Autowired
//    private EmployeeRepo employeeRepo;

    @GetMapping
    @RequestMapping("/users")
    public String getAllusers(Model model){
        model.addAttribute("userRepo.findAll()");
        return "userList";
    }

    @GetMapping
    @RequestMapping("/doctors")
    public String getAllDoctors(Model model){
        model.addAttribute("employeeRepo.findAll()");
        return "employeList";
    }
}
