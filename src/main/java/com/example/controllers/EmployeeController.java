package com.example.controllers;

import com.example.repos.EmployeeRepo;
import com.example.repos.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/doctors")
public class EmployeeController {
    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    ReviewRepo reviewRepo;


    @GetMapping
    public String doctorsList(Model model){
        model.addAttribute("doctors", employeeRepo.findAll());
        return "employees";
    }

    @GetMapping
    @RequestMapping("/{id}")
    public String getDoctor(@PathVariable Integer id, Model model){
        model.addAttribute("employee", employeeRepo.findFirstById(id));
        return "doctorInfo";
    }
}

