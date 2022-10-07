package com.example.rentalAgency.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "customer_name")
    private String name;

    @Column(name = "customer_surname")
    private String surname;

    @Column(name = "customer_email")
    private String email;

    @Column(name = "customer_address")
    private String address;

    @Column(name = "customer_phone_number")
    private String phoneNumber;

    @Column(name="customer_driver_license")
    private String driverLicense;

    @Column(name = "customer_age")
    private int age;


}
