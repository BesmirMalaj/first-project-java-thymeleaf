package com.example.rentalAgency.controller;


import com.example.rentalAgency.model.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/login")
    public String login() {

        return "login";
    }
}
