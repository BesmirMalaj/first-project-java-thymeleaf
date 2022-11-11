package com.example.rentalAgency.controller;


import com.example.rentalAgency.model.Admin;
import com.example.rentalAgency.model.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AdminController {
    @RequestMapping("/admin")
    public String admin() {

        return "admin";
    }
    @RequestMapping("/contact")
    public String contact() {

        return "contact";
    }
    @RequestMapping("/about")
    public String about() {

        return "about";
    }
    @RequestMapping("/pricing")
    public String pricing() {

        return "pricing";
    }
    @RequestMapping("/services")
    public String services() {

        return "services";
    }


    @PostMapping("/login")
    public String login(@ModelAttribute Admin admin, Model model) {
        model.addAttribute("admin", admin);

        return "admin";
    }

}
