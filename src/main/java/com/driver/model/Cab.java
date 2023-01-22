package com.driver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Cab{
	
	
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  
  private int perKmRate;
  
  private boolean availabe;
  
  
  @OneToOne
  private Driver driver;
  

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getPerKmRate() {
	return perKmRate;
}

public void setPerKmRate(int perKmRate) {
	this.perKmRate = perKmRate;
}

public boolean getAvailabe() {
	return availabe;
}

public void setAvailabe(boolean availabe) {
	this.availabe = availabe;
}


public Driver getDriver() {
	return driver;
}

public void setDriver(Driver driver) {
	this.driver = driver;
}

public Cab(int id, int perKmRate, boolean availabe) {
	super();
	this.id = id;
	this.perKmRate = perKmRate;
	this.availabe = availabe;
}

public Cab() {
	super();
	// TODO Auto-generated constructor stub
}
  
  
  
}