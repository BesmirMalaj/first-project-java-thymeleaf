package com.example.rentalAgency.services.implementation;

import com.example.rentalAgency.model.Rental;
import com.example.rentalAgency.repository.RentalRepository;
import com.example.rentalAgency.services.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RentalImpl implements RentalService {

    @Autowired
    private RentalRepository rentalRepository;

    @Override
    public Rental addRental(Rental rental) {
        return rentalRepository.save(rental);
    }

    @Override
    public Rental updateRental(Long id, Rental rental) {
        Rental rental1 = rentalRepository.findById(id).get();
        rental1.setContactAdress(rental.getContactAdress());
        rental1.setName(rental.getName());
        rental1.setOwner(rental.getOwner());
        rental1.setInternetDomain(rental.getInternetDomain());
        return rentalRepository.save(rental1);
    }

    @Override
    public void deleteRental(Long id) {
        rentalRepository.deleteById(id);
    }

    @Override
    public List<Rental> findAll() {
        return rentalRepository.findAll();
    }
}
