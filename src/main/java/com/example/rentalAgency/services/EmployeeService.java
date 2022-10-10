package com.example.rentalAgency.services;

import com.example.rentalAgency.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(Long id);

    Employee addEmployee(Employee employee);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployeeById(Long id);


}
