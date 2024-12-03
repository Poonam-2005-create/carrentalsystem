package com.carrentalsystem.carrental.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long contact_id;
private String name;
private String email;
private String subject;
private String message;
public long getContact_id() {
	return contact_id;
}
public void setContact_id(long contact_id) {
	this.contact_id = contact_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Contact(long contact_id, String name, String email, String subject, String message) {
	super();
	this.contact_id = contact_id;
	this.name = name;
	this.email = email;
	this.subject = subject;
	this.message = message;
}
public Contact() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Contact [contact_id=" + contact_id + ", name=" + name + ", email=" + email + ", subject=" + subject
			+ ", message=" + message + "]";
}

}
