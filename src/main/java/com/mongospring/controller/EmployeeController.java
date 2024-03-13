package com.mongospring.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongospring.model.Employee;
import com.mongospring.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/employee/")
@RequiredArgsConstructor
public class EmployeeController {
	
	
	private final EmployeeService employeeService;
	
	
	
	@PostMapping("/")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
		String id = employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(id);
	}

	@GetMapping("/")
	public ResponseEntity<List<Employee>> findAllEmployee() {
		List<Employee> employees  = employeeService.findAllEmployee();
		return ResponseEntity.status(HttpStatus.OK).body(employees);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") String id) {
	
		employeeService.deleteEmployee(id);
		return ResponseEntity.status(HttpStatus.OK).body(id);
	}
	
	@PutMapping("/")
	public ResponseEntity<String> updateEmployee(Employee employee) {
	
		String id = employeeService.updateEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK).body(id);
	}

}
