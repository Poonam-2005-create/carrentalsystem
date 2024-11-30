package com.carrentalsystem.carrental.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long Cust_id;
private String Location;
private Date PickupDate;
private Date ReturnDate;
private String FullName;
private String Mobile_Number;
private String Email_Id;
private String Driver_Service;
private int Car_Count;
public long getCust_id() {
	return Cust_id;
}
public void setCust_id(long cust_id) {
	Cust_id = cust_id;
}
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
public Date getPickupDate() {
	return PickupDate;
}
public void setPickupDate(Date pickupDate) {
	PickupDate = pickupDate;
}
public Date getReturnDate() {
	return ReturnDate;
}
public void setReturnDate(Date returnDate) {
	ReturnDate = returnDate;
}
public String getFullName() {
	return FullName;
}
public void setFullName(String fullName) {
	FullName = fullName;
}
public String getMobile_Number() {
	return Mobile_Number;
}
public void setMobile_Number(String mobile_Number) {
	Mobile_Number = mobile_Number;
}
public String getEmail_Id() {
	return Email_Id;
}
public void setEmail_Id(String email_Id) {
	Email_Id = email_Id;
}
public String getDriver_Service() {
	return Driver_Service;
}
public void setDriver_Service(String driver_Service) {
	Driver_Service = driver_Service;
}
public int getCar_Count() {
	return Car_Count;
}
public void setCar_Count(int car_Count) {
	Car_Count = car_Count;
}
public Customer(long cust_id, String location, Date pickupDate, Date returnDate, String fullName, String mobile_Number,
		String email_Id, String driver_Service, int car_Count) {
	super();
	Cust_id = cust_id;
	Location = location;
	PickupDate = pickupDate;
	ReturnDate = returnDate;
	FullName = fullName;
	Mobile_Number = mobile_Number;
	Email_Id = email_Id;
	Driver_Service = driver_Service;
	Car_Count = car_Count;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Customer [Cust_id=" + Cust_id + ", Location=" + Location + ", PickupDate=" + PickupDate + ", ReturnDate="
			+ ReturnDate + ", FullName=" + FullName + ", Mobile_Number=" + Mobile_Number + ", Email_Id=" + Email_Id
			+ ", Driver_Service=" + Driver_Service + ", Car_Count=" + Car_Count + "]";
}


}
