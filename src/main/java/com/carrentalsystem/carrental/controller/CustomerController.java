package com.carrentalsystem.carrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.carrentalsystem.carrental.entity.Customer;
import com.carrentalsystem.carrental.service.CustomerService;

@Controller
public class CustomerController {
private CustomerService customerService;
public CustomerController(CustomerService customerService) {
	this.customerService=customerService;
}
@GetMapping("/")
public String getCustomerHomePage(Model model) {
	model.addAttribute("customer",new Customer());
	return "index";
}
@GetMapping("/feedback")
public String getfeedback() {
	return "feedback";
	
}
@GetMapping("/contact")
public String getcontact() {
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
}
