package com.carrentalsystem.carrental.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.carrentalsystem.carrental.entity.Contact;
import com.carrentalsystem.carrental.entity.Customer;
import com.carrentalsystem.carrental.entity.Feedback;
import com.carrentalsystem.carrental.service.ContactService;
import com.carrentalsystem.carrental.service.CustomerService;
import com.carrentalsystem.carrental.service.FeedbackService;

@Controller
public class CustomerController {
private CustomerService customerService;
private ContactService contactService;
private FeedbackService feedbackService;
public CustomerController(CustomerService customerService) {
	this.customerService=customerService;
}
@GetMapping("/")
public String getCustomerHomePage(Model model) {
	model.addAttribute("customer",new Customer());
	return "index";
}
@GetMapping("/contact")
public String getcontact(Model model) {
	model.addAttribute("contact",new Contact());
	return "contact";
	
}
@GetMapping("/carsfulldetails_payment")
public String getbookcar() {
	return "carsfulldetails_payment";
}

@PostMapping("/getcar")
public String getcarPage(@ModelAttribute Customer customer) {
	customerService.saveCustomer(customer);
	return "getcar";
}
@PostMapping("/savecontact")
public String getContactPage(@ModelAttribute Contact contact, Model model) {
    try {
        contactService.saveContact(contact);
        model.addAttribute("message", "Contact saved successfully!");
    } catch (Exception e) {
        model.addAttribute("error", "An error occurred.");
    }
    return "redirect:/contact";
}

@GetMapping("/feedback")
public String getFeedbackPage(Model model) {
    model.addAttribute("feedback", new Feedback());
    return "feedback";
}

@PostMapping("/savefeedback")
public String submitFeedback(@ModelAttribute Feedback feedback, Model model) {
    try {
        feedbackService.saveFeedback(feedback);
        model.addAttribute("message", "Thank you for your feedback!");
    } catch (Exception e) {
        model.addAttribute("error", "An error occurred.");
    }
    return "redirect:/feedback";
}
}
