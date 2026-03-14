package com.inventory.inventory_backend.controller;

import com.inventory.inventory_backend.model.Employee;
import com.inventory.inventory_backend.Service.EmployeeServices;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
    @RequestMapping("/api/employees")   // ✅ lowercase + plural
@CrossOrigin
public class EmployeeController {

    private final EmployeeServices employeeService;  // ✅ singular

    public EmployeeController(EmployeeServices employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.saveemployee(employee);  // ✅ camelCase
    }

    @GetMapping
    public List<Employee> getEmployee() {
        return employeeService.getAllEmployees();
    }

    @DeleteMapping("/{id}")   // ✅ Fixed — was {"/id"}
    public void deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployee(id);
    }
}