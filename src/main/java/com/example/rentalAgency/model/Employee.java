package com.example.rentalAgency.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "employee")
@Component
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private Long id;

    @Column(name = "employee_first_name")
    private String firstName;

    @Column(name = "employee_last_name")
    private String lastName;

    @Column(name = "employee_username")
    private String username;

    @Column(name = "employee_password")
    private String password;

    @Column(name = "employee_role")
    private String role;

    @Column(name = "employee_enabled")
    private boolean enabled;

    @ManyToOne(fetch = FetchType.EAGER)
    private Branch branch;





}
