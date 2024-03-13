package com.mongospring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mongospring.model.Employee;
import com.mongospring.repository.EmployeeRepository;
import com.mongospring.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	@Override
	public String addEmployee(Employee employee) {
		Employee emp = employeeRepository.save(employee);
		return emp.getId();
	}

	@Override
	public List<Employee> findAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public String deleteEmployee(String employeeId) {
		employeeRepository.deleteById(employeeId);
		return employeeId;
	}

	@Override
	public String updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		return employee.getId();
	}
}
