package com.example.rentalAgency.repository;

import com.example.rentalAgency.model.Admin;
import com.example.rentalAgency.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
    public interface AdminRepository extends JpaRepository<Admin, Long> {

    Admin findAdminByUsername(String username);

    }
