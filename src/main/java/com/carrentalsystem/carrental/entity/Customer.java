package com.carrentalsystem.carrental.entity;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long cust_id;
	private String location;
	private LocalDate pickupDate;
	private LocalDate returnDate;
	private String fullName;
	private String mobileNumber;
	private String emailId;
	private String driverService;
	private int carCount;
	public long getCust_id() {
		return cust_id;
	}
	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public LocalDate getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(LocalDate pickupDate) {
		this.pickupDate = pickupDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDriverService() {
		return driverService;
	}
	public void setDriverService(String driverService) {
		this.driverService = driverService;
	}
	public int getCarCount() {
		return carCount;
	}
	public void setCarCount(int carCount) {
		this.carCount = carCount;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", location=" + location + ", pickupDate=" + pickupDate
				+ ", returnDate=" + returnDate + ", fullName=" + fullName + ", mobileNumber=" + mobileNumber
				+ ", emailId=" + emailId + ", driverService=" + driverService + ", carCount=" + carCount + "]";
	}
	public Customer(long cust_id, String location, LocalDate pickupDate, LocalDate returnDate, String fullName,
			String mobileNumber, String emailId, String driverService, int carCount) {
		super();
		this.cust_id = cust_id;
		this.location = location;
		this.pickupDate = pickupDate;
		this.returnDate = returnDate;
		this.fullName = fullName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.driverService = driverService;
		this.carCount = carCount;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}




}
