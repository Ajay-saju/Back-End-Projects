package com.springdemo.payroll;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;

@RestController
class EmployeeController {
    final EmployeeRepository repository;

    EmployeeController(EmployeeRepository employeeRepository) {
        this.repository = employeeRepository;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/employees")
    List<Employee> all() {
        return repository.findAll();
    }

    // end::get-aggregate-root[]
    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    // Single item

    @PostMapping("/employees/{id}")
    Employee one(@PathVariable int id) {
        return repository.findById(id).orElseThrow(() -> new EmplpyeeNotFountException(id));
    }

    @PutMapping("/employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

        return repository.findById(id).map(
                employee -> {
                    employee.setName(newEmployee.getName());
                    employee.setRole(newEmployee.getRole());
                    return repository.save(employee);
                }
        ).orElseGet(() -> {
            return repository.save(newEmployee);
        });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
