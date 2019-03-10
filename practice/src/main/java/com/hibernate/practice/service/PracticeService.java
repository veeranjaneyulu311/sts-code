package com.hibernate.practice.service;

import java.util.List;

import com.hibernate.practice.beans.Employee;

public interface PracticeService {

	public void createEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(int id);

	public void removeEmployee(int id);

	public void updateEmployee(Employee employee);

	

}
