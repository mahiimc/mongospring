package com.mongospring.service;

import java.util.List;

import com.mongospring.model.Employee;

public interface EmployeeService {
	
	String addEmployee(Employee employee);
	List<Employee> findAllEmployee();
	String deleteEmployee(String employeeId);
	String updateEmployee(Employee employee);
}
