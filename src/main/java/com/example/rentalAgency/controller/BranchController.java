package com.example.rentalAgency.controller;

import com.example.rentalAgency.model.Branch;
import com.example.rentalAgency.services.implementation.BranchImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private BranchImpl branchImpl;

    @PostMapping("/addBranch")
    public ResponseEntity<Branch> addNewBranch(Branch branch){
        return new ResponseEntity<>(branchImpl.addBranch(branch), HttpStatus.OK);
    }

}
