package com.hibernate.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.practice.beans.Employee;
import com.hibernate.practice.service.PracticeService;

@RestController
public class PracticeController {

	// http://candidjava.com/tutorial/spring-boot-hibernate-crud-example/

	@Autowired
	private PracticeService practiceService;

	@PostMapping(value = "/create")
	public void createEmployee(@RequestBody Employee employee) {
		 practiceService.createEmployee(employee);
	}

	@GetMapping(value = "/get")
	public List<Employee> getAllEmployees() {
		return practiceService.getAllEmployees();
	}

	@GetMapping(value = "/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return practiceService.getEmployeeById(id);
	}

	@PostMapping("/update")
	public void updateEmployee(@RequestBody Employee employee) {
		practiceService.updateEmployee(employee);
	}

	@GetMapping("/delete/{id}")
	public void removeEmployee(@PathVariable("id") int id) {
		practiceService.removeEmployee(id);
	}

}
