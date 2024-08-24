package com.jatin.springboot_orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jatin.springboot_orm.entity.Employee;

/**
 * EmployeeRepository
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	
}
