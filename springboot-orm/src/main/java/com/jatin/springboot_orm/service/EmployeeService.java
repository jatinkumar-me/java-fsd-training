package com.jatin.springboot_orm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jatin.springboot_orm.entity.Employee;
import com.jatin.springboot_orm.repository.EmployeeRepository;

/**
 * EmployeeService
 */
@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	/**
	 * @param id
	 * @return
	 */
	public Employee getEmployeeById(int id) {
		Optional<Employee> employee = employeeRepository.findById(id);

		if (employee.isPresent()) {
			return employee.get();
		}

		return null;
	}

	/**
	 * @return 
	 */
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employee -> employees.add(employee));

		return employees;
	}

	/**
	 * @param employee
	 */
	public void saveOrUpdate(Employee employee) {
		employeeRepository.save(employee);
	}

	/**
	 * @param id
	 */
	public void deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
	}
}
