package com.example.rentalAgency.controller;

import com.example.rentalAgency.model.Reservation;
import com.example.rentalAgency.services.implementation.ReservationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationImpl reservationImpl;

    @PostMapping("/addReservation")
    public ResponseEntity<Reservation> addReservation(Reservation reservation){
        return new ResponseEntity<>(reservationImpl.addReservation(reservation), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Reservation>> listAll(){
        return new ResponseEntity<>(reservationImpl.listAll(),HttpStatus.OK);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Reservation> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(reservationImpl.findById(id),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id){
        reservationImpl.deleteReservation(id);
    }

    @PostMapping("/update")
    public ResponseEntity<Reservation> updateById(Long id,Reservation reservation){
        return new ResponseEntity<>(reservationImpl.updateReservation(id,reservation),HttpStatus.OK);
    }



}
