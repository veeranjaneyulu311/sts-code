package com.hibernate.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.practice.beans.Employee;
import com.hibernate.practice.dao.PracticeDao;

@Service
public class PracticeServiceImpl implements PracticeService {

	@Autowired
	private PracticeDao practiceDao;

	@Override
	public void createEmployee(Employee employee) {
		practiceDao.createEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return practiceDao.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return practiceDao.getEmployeeById(id);
	}

	@Override
	public void removeEmployee(int id) {
		practiceDao.removeEmployee(id);
	}

	@Override
	public void updateEmployee(Employee employee) {
		practiceDao.updateEmployee(employee);
	}

}
