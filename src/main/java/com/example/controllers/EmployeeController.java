package com.example.controllers;

import com.example.entities.Register;
import com.example.entities.Review;
import com.example.entities.User;
import com.example.repos.EmployeeRepo;
import com.example.repos.RegisterRepo;
import com.example.repos.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/doctors")
public class EmployeeController {
    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    ReviewRepo reviewRepo;
    @Autowired
    RegisterRepo registerRepo;


    @GetMapping
    public String doctorsList(Model model){
        model.addAttribute("doctors", employeeRepo.findAll());
        return "employees";
    }

    @GetMapping
    @RequestMapping("/{id}")
    public String getDoctor(@PathVariable Integer id, Model model){
        model.addAttribute("employee", employeeRepo.findByCount(id));
        return "doctorInfo";
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String postReview(@Valid Review review, @AuthenticationPrincipal User user, @PathVariable Integer id, Model model){
        review.setAuthor(user);
        review.setAddressee(employeeRepo.findByCount(id));

        reviewRepo.save(review);
        model.addAttribute("employee", employeeRepo.findByCount(id));
        return "doctorInfo";
    }

    @GetMapping
    @RequestMapping("/{id}/register")
    public String register(Model model, @PathVariable Integer id){
        model.addAttribute("employee", employeeRepo.findByCount(id));
        return "zapis";
    }

    @RequestMapping(value = "/{id}/register", method = RequestMethod.POST)
    public String addRegister(@AuthenticationPrincipal User user, @PathVariable Integer id,
                              Model model, @Valid Register register) {
        model.addAttribute("employee", employeeRepo.findByCount(id));
        registerRepo.save(new Register(register.getDate(), employeeRepo.findByCount(id), user));

        model.addAttribute("employee", employeeRepo.findByCount(id));
        return "redirect:/";
    }
}

