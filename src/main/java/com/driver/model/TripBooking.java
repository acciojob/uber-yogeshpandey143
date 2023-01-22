package com.driver.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



public class TripBooking{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tripBookingId;
	
	private String fromLocation ;
	
	private String toLocation;
	
	private int bill;
	
	private int  distanceInKm;
	
	private TripStatus status;
	
	 @ManyToOne
     @JoinColumn
     private Driver driver;
	 
	 @ManyToOne
     @JoinColumn
     private Customer customer;



	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getTripBookingId() {
		return tripBookingId;
	}

	public void setTripBookingId(int tripBookingId) {
		this.tripBookingId = tripBookingId;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	public int getDistanceInKm() {
		return distanceInKm;
	}

	public void setDistanceInKm(int distanceInKm) {
		this.distanceInKm = distanceInKm;
	}

	public TripStatus getStatus() {
		return status;
	}

	public void setStatus(TripStatus status) {
		this.status = status;
	}

	public TripBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TripBooking(int tripBookingId, String fromLocation, String toLocation, int bill, int distanceInKm,
			TripStatus status) {
		super();
		this.tripBookingId = tripBookingId;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.bill = bill;
		this.distanceInKm = distanceInKm;
		this.status = status;
	}
	
	public TripBooking( String fromLocation, String toLocation,  int distanceInKm,
			TripStatus status) {
		super();
		
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		
		this.distanceInKm = distanceInKm;
		this.status = status;
	}
	
}
