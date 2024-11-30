package com.carrentalsystem.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carrentalsystem.carrental.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
