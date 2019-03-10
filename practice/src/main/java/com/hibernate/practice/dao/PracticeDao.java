package com.hibernate.practice.dao;

import java.util.List;

import com.hibernate.practice.beans.Employee;

public interface PracticeDao {
	
	public void createEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(int id);

	public void removeEmployee(int id);

	public void updateEmployee(Employee employee);

}
