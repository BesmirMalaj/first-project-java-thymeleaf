package com.example.rentalAgency.controller;

import com.example.rentalAgency.model.Employee;
import com.example.rentalAgency.services.implementation.EmployeeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeImpl employeeImpl;

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(Employee employee){
        return new ResponseEntity<>(employeeImpl.addEmployee(employee), HttpStatus.OK);
    }


}
