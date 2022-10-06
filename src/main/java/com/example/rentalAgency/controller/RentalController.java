package com.example.rentalAgency.controller;

import com.example.rentalAgency.model.Rental;
import com.example.rentalAgency.services.implementation.RentalImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rental")
public class RentalController {

    @Autowired
    private RentalImpl rentalImpl;

    @RequestMapping("/addRental")
    public ResponseEntity<Rental> addRental(Rental rental){
        return new ResponseEntity<>(rentalImpl.addRental(rental), HttpStatus.OK);
    }




}
