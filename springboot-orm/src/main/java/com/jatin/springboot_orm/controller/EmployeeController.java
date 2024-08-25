package com.jatin.springboot_orm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jatin.springboot_orm.entity.Employee;
import com.jatin.springboot_orm.service.EmployeeService;

/**
 * EmployeeController
 */
@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees")
	public java.util.List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		return employeeService.getEmployeeById(id);
	}

	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployeeById(id);
	}

	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.saveOrUpdate(employee);
	}

	@PutMapping("/employee")
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.saveOrUpdate(employee);
	}
}
