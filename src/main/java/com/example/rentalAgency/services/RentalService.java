package com.example.rentalAgency.services;

import com.example.rentalAgency.model.Rental;

import java.util.List;

public interface RentalService {

    Rental addRental(Rental rental);

    Rental updateRental(Long id, Rental rental);

    void deleteRental(Long id);

    List<Rental> findAll();

}
