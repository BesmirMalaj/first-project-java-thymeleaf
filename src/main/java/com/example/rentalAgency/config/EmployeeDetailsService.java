package com.example.rentalAgency.config;

import com.example.rentalAgency.model.Employee;
import com.example.rentalAgency.model.EmployeeDetails;
import com.example.rentalAgency.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDetailsService implements UserDetailsService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Employee employee=employeeRepository.findEmployeeByUsername(username);

        if(employee==null){
            throw new UsernameNotFoundException("User not found");
        }
        return new EmployeeDetails(employee);
    }
}
