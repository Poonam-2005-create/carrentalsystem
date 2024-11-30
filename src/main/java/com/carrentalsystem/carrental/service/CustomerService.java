package com.carrentalsystem.carrental.service;

import org.springframework.stereotype.Service;

import com.carrentalsystem.carrental.entity.Customer;
import com.carrentalsystem.carrental.repository.CustomerRepository;
@Service
public class CustomerService {
private CustomerRepository customerRepository;
public CustomerService(CustomerRepository customerRepository) {
	this.customerRepository=customerRepository;
}
public Customer saveCustomer(Customer customer) {
	return customerRepository.save(customer);
}
}
