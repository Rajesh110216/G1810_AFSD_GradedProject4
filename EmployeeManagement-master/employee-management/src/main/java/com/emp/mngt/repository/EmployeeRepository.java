package com.emp.mngt.repository;

import org.springframework.data.repository.CrudRepository;

import com.emp.mngt.model.Employee;

// interface extending crud repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
}
