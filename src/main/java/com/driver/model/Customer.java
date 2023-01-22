package com.driver.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	private String mobile;
	
	private String password;

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy ="customer")
    private List<TripBooking> tripBookingList;
    
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer(int customerId, String mobile, String password) {
		super();
		this.customerId = customerId;
		this.mobile = mobile;
		this.password = password;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}