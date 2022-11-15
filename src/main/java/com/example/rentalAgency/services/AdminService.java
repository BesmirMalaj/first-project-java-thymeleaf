package com.example.rentalAgency.services;

import com.example.rentalAgency.model.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> findAll();

    Admin findById(Long id);

    Admin addAdmin(Admin admin);

    Admin updateAdmin(Long id, Admin admin);

    void deleteAdminById(Long id);
}
