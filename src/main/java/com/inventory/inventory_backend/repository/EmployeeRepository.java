package com.inventory.inventory_backend.repository;

import com.inventory.inventory_backend.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,String>{
}
