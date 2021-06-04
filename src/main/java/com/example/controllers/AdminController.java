package com.example.controllers;


import com.example.entities.Employee;
import com.example.entities.Register;
import com.example.entities.Review;
import com.example.entities.User;
import com.example.repos.EmployeeRepo;
import com.example.repos.RegisterRepo;
import com.example.repos.ReviewRepo;
import com.example.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ReviewRepo reviewRepo;

    @Autowired
    private RegisterRepo registerRepo;

    @GetMapping
    public String adminPanel(){
        return "adminPage";
    }

    @GetMapping
    @RequestMapping("/users")
    public String getAllusers(Model model){
        model.addAttribute("users", userRepo.findAll());
        return "userList";
    }

    @GetMapping
    @RequestMapping("/doctors")
    public String getAllDoctors(Model model){
        model.addAttribute("employees", employeeRepo.findAll());
        return "listEmployee";
    }

    @RequestMapping(value = "/doctors", method = RequestMethod.POST)
    public String addNewEmployee(
            Model model,
            @RequestParam("firstname") String firstName,
            @RequestParam("secondname") String secondName,
            @RequestParam("cabinet") String cabinet,
            @RequestParam("details") String details,
            @RequestParam("profession") String profession
            ) {
        employeeRepo.save(new Employee(firstName, secondName, cabinet, details, profession));
        model.addAttribute("employees", employeeRepo.findAll());
        return "listEmployee";
    }

    @GetMapping
    @RequestMapping("/comments")
    public String getAllComments(Model model){
        model.addAttribute("comments", reviewRepo.findAll());
        return "adminReview";
    }

    @GetMapping
    @RequestMapping("/users/{username}")
    public String getAllusers(Model model, @PathVariable String username){
        model.addAttribute("user", userRepo.findByUsername(username));
        model.addAttribute("reg", registerRepo.findAllByUser(userRepo.findByUsername(username)));
        return "userEdit";
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String deleteUser(@RequestParam("regId") Register register, @RequestParam(value = "enabled", required = false) boolean enabled){

        register.setEnabled(enabled);

        registerRepo.save(register);


        return "redirect:/admin";
    }

    @RequestMapping(value = "/comments", method = RequestMethod.POST)
    public String editComments(
            Model model,
            @RequestParam(value = "enabled", required = false) boolean enabled,
            @RequestParam("reviewId") Review review
    ){
        review.setEnabled(enabled);
        reviewRepo.save(review);

        model.addAttribute("comments", reviewRepo.findAll());
        return "adminReview";
    }
}
