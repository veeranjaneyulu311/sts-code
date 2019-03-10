package com.hibernate.practice.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS", schema = "veer")
public class Address {
	@Id
	@GeneratedValue
	private int addressId;
	private String addressType;
	private String streetName;
	private String city;
	private int pincode;
	
	@ManyToOne
	private Employee employee;

	public Address() {

	}

	
	public Address(int addressId, String addressType, String streetName, String city, int pincode) {
		super();
		this.addressId = addressId;
		this.addressType = addressType;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}


	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	
	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}


	public int getAddressId() {
		return addressId;
	}


	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
