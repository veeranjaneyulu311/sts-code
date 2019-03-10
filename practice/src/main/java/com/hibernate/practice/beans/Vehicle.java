package com.hibernate.practice.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="vehicle",schema="veer")
public class Vehicle {

	@Id
	private int vehicleNo;
	private String vehicleType;
	private String vehicleModel;
	
	@OneToOne(mappedBy="vehicle")
	private Employee employee;

	public Vehicle() {

	}

	

	public Vehicle(int vehicleNo, String vehicleType, String vehicleModel, Employee employee) {
		super();
		this.vehicleNo = vehicleNo;
		this.vehicleType = vehicleType;
		this.vehicleModel = vehicleModel;
		this.employee = employee;
	}



	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
