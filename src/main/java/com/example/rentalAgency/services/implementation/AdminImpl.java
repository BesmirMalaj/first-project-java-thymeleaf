package com.example.rentalAgency.services.implementation;

import com.example.rentalAgency.model.Admin;
import com.example.rentalAgency.model.Employee;
import com.example.rentalAgency.repository.AdminRepository;
import com.example.rentalAgency.repository.EmployeeRepository;
import com.example.rentalAgency.services.AdminService;
import com.example.rentalAgency.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


import com.example.rentalAgency.model.Employee;
import com.example.rentalAgency.repository.EmployeeRepository;
import com.example.rentalAgency.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

    @Service
    @Transactional
    public class AdminImpl implements AdminService {

        @Autowired
        private AdminRepository adminRepository;

        @Override
        public List<Admin> findAll() {
            return null;
        }

        @Override
        public Admin findById(Long id) {
            return null;
        }

        @Override
        public Admin addAdmin(Admin admin) {
            return null;
        }

        @Override
        public Admin updateAdmin(Long id, Admin admin) {
            return null;
        }

        @Override
        public void deleteAdminById(Long id) {

        }
    }
