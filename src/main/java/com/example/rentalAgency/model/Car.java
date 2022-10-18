package com.example.rentalAgency.model;

import com.example.rentalAgency.model.enumeration.Gearbox;
import com.example.rentalAgency.model.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;
import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "car_brand")
    private String brand;


    @Column(name = "car_name")
    private String model;

    @Column(name = "car_year")
    @Range(min=1900, max=2025, message = "")
    private Integer year;

    @Column(name = "car_color")
    private String color;

    @Enumerated(EnumType.STRING)
    @Column(name = "car_status")
    private Status status;

    @Column(name = "car_mileage")
    private Integer mileage;

    @Column(name = "car_image")
    private String imageUrl;


    @Column(name = "car_fee_per_day")
    private Integer feePerDay;

    @Column(name = "car_total_amount")
    private Integer totalAmountFromCar;

    @Enumerated(EnumType.STRING)
    @Column(name = "car_gearbox")
    private Gearbox gearbox;

    @ManyToOne(fetch = FetchType.EAGER)
    private Branch branch;



}
