package com.example.rentalAgency.services.implementation;

import com.example.rentalAgency.model.Customer;
import com.example.rentalAgency.repository.CustomerRepository;
import com.example.rentalAgency.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> listAll() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        Customer customer1 = customerRepository.findById(id).get();
        customer1.setAddress(customer.getAddress());
        customer1.setAge(customer.getAge());
        customer1.setName(customer.getName());
        customer1.setEmail(customer.getEmail());
        customer1.setDriverLicense(customer.getDriverLicense());
        customer1.setPhoneNumber(customer.getPhoneNumber());
        customer1.setSurname(customer.getSurname());
       return customerRepository.save(customer1);
    }
}
