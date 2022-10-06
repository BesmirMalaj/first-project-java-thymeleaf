package com.example.rentalAgency.services;

import com.example.rentalAgency.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer addCustomer(Customer customer);

    List<Customer> listAll();

    void deleteCustomer(Long id);

    Customer updateCustomer(Long id, Customer customer);

}
