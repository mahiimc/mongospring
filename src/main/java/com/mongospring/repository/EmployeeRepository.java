package com.mongospring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongospring.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
