package com.example.rentalAgency.services.implementation;

import com.example.rentalAgency.model.Car;
import com.example.rentalAgency.repository.CarRepository;
import com.example.rentalAgency.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CarImpl implements CarService {


    @Autowired
    private CarRepository carRepository;

    @Override
    public Car save(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car updateCar(Long id, Car car) {
       Car car1= carRepository.findById(id).get();
       car1.setBranch(car.getBranch());
       car1.setColor(car.getColor());
       car1.setMileage(car.getMileage());
       car1.setGearbox(car.getGearbox());
       car1.setYear(car.getYear());
       car1.setFeePerDay(car.getFeePerDay());
       car1.setModel(car.getModel());
       car1.setTotalAmountFromCar(car.getTotalAmountFromCar());
       car1.setStatus(car.getStatus());
       return carRepository.save(car1);
    }

    @Override
    public void deleteCarById(Long id) {
        if(carRepository.findById(id).isPresent()){
            carRepository.deleteById(id);
        }

    }

    @Override
    public List<Car> findAll() {
       return carRepository.findAll();
    }
}
