package com.example.rentalAgency.controller;

import com.example.rentalAgency.model.Owner;
import com.example.rentalAgency.services.implementation.OwnerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private OwnerImpl ownerImpl;

    @PostMapping("/addOwner")
    public ResponseEntity<Owner> addNewOwner(@RequestBody Owner owner){
        return new ResponseEntity<>(ownerImpl.addOwner(owner), HttpStatus.OK);
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<Owner>> listOwner(){
        return new ResponseEntity<>(ownerImpl.findAllOwners(),HttpStatus.OK);
    }


}
