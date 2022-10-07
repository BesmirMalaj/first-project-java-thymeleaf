package com.example.rentalAgency.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "rental")
public class Rental {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "internet_domain")
    private String internetDomain;

    @Column(name = "contact_address")
    private String contactAdress;

    @ManyToOne(fetch = FetchType.EAGER)
    private Owner owner;



}
