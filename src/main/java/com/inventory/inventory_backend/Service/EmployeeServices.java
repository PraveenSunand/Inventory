package com.inventory.inventory_backend.Service;
import java.util.*;

import com.inventory.inventory_backend.model.Employee;
import com.inventory.inventory_backend.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServices {

    private final EmployeeRepository employeerepository;

    public EmployeeServices(EmployeeRepository employeerepository) {
        this.employeerepository = employeerepository;
    }

    public Employee saveemployee(Employee employee){
        return employeerepository.save(employee);}
    public List<Employee> getAllEmployees(){
        return employeerepository.findAll();
    }
    public void deleteEmployee(String id){
        employeerepository.deleteById(id);
    }
}
