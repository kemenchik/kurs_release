package com.example.controllers;

//import kurs.demo.repos.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("reviews")
public class ReviewController {
//
//    @Autowired
//    private ReviewRepo reviewRepo;

    @GetMapping
    public String getReviews(Model model){
        model.addAttribute("reviews", "reviewRepo.findAllByEnabledTrue()");
        return "reviews";
    }
}
