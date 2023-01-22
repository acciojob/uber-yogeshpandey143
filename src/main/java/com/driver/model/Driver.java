package com.driver.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Driver{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int driverId;
	
	private String mobile;
	
	private String password;
	
	
	@OneToOne
	private Cab cab;
	
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy ="driver")
    private List<TripBooking> tripBookingList;
    

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	public List<TripBooking> getTripBookingList() {
		return tripBookingList;
	}

	public void setTripBookingList(List<TripBooking> tripBookingList) {
		this.tripBookingList = tripBookingList;
	}

	public Driver(int driverId, String mobile, String password, List<TripBooking> tripBookingList) {
		super();
		this.driverId = driverId;
		this.mobile = mobile;
		this.password = password;
		this.tripBookingList = tripBookingList;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
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

	public Driver(int driverId, String mobile, String password) {
		super();
		this.driverId = driverId;
		this.mobile = mobile;
		this.password = password;
	}

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}