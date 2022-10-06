package com.example.rentalAgency.controller;

import com.example.rentalAgency.model.Reservation;
import com.example.rentalAgency.services.implementation.ReservationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationImpl reservationImpl;

    @RequestMapping("/addReservation")
    public ResponseEntity<Reservation> addReservation(Reservation reservation){
        return new ResponseEntity<>(reservationImpl.addReservation(reservation), HttpStatus.OK);
    }

}
