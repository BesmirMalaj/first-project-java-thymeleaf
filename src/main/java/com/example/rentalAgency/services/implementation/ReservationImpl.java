package com.example.rentalAgency.services.implementation;

import com.example.rentalAgency.model.Reservation;
import com.example.rentalAgency.repository.ReservationRepository;
import com.example.rentalAgency.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class ReservationImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;


    @Override
    public Reservation addReservation(Reservation reservation) {
        int dataFillimit=reservation.getRentalDate().getDayOfMonth();
        int dataMbarimit=reservation.getReturnDate().getDayOfMonth();
        int ditetTotale=(dataMbarimit-dataFillimit)+1;
        int shumaPerDite=reservation.getCar().getFeePerDay();
        int shumaTotale=ditetTotale*shumaPerDite;
        reservation.setTotalAmount(shumaTotale);
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> listAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Long id, Reservation reservation) {
        Reservation reservation1= reservationRepository.findById(id).get();
        reservation1.setCar(reservation.getCar());
        reservation1.setReturnDate(reservation.getReturnDate());
        reservation1.setRentalDate(reservation.getRentalDate());
        reservation1.setDateOfBooking(reservation.getDateOfBooking());
        reservation1.setTotalAmount(reservation.getTotalAmount());
        return reservationRepository.save(reservation1);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
