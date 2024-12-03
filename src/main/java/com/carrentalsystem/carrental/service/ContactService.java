package com.carrentalsystem.carrental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carrentalsystem.carrental.entity.Contact;
import com.carrentalsystem.carrental.repository.ContactRepository;
@Service
public class ContactService {
private ContactRepository contactRepository;

public ContactService(ContactRepository contactRepository) {
	this.contactRepository=contactRepository;
}
public Contact saveContact(Contact contact) {
	return contactRepository.save(contact);
}
}
