package com.carrentalsystem.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carrentalsystem.carrental.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long> {

}
