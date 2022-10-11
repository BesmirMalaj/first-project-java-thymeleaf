package com.example.rentalAgency.controller;

import com.example.rentalAgency.model.Car;
import com.example.rentalAgency.services.implementation.CarImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarImpl carImpl;

    @PostMapping("/addCar")
    public ResponseEntity<Car> addCar( Car car){
        return new ResponseEntity<>(carImpl.save(car), HttpStatus.OK);
    }

    @GetMapping("/automatic")
    public ResponseEntity<List<Car>> automaticCars(){
        return new ResponseEntity<>(carImpl.findAllAutomatic(),HttpStatus.OK);
    }

    @GetMapping("/model/{name}")
    public ResponseEntity<List<Car>> findByModel(@PathVariable("name") String name){
        return new ResponseEntity<>(carImpl.findAllByModel(name),HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Car>> findAll(){
        return new ResponseEntity<>(carImpl.findAll(),HttpStatus.OK);
    }


}
