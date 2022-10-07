package com.example.rentalAgency.repository;

import com.example.rentalAgency.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {

    @Query(value = "SELECT c.* FROM Car c WHERE c.car_gearbox='AUTOMATIC'",nativeQuery = true)
    List<Car> findAllAutomaticCars();

    @Query(value = "SELECT c.* from Car c where c.car_name=:carName", nativeQuery=true)
    List<Car> findAllByModel(@Param("carName") String carName);





}
