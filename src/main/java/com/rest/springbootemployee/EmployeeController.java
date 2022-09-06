package com.rest.springbootemployee;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeRepository employeesRepository;

    public EmployeeController (EmployeeRepository employeeRepository) {
        this.employeesRepository = employeeRepository;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeesRepository.findAll();
    }

    @GetMapping("/{employeeID}")
    public Employee getById(@PathVariable Integer employeeID) {
        return employeesRepository.findById(employeeID);
    }

    @GetMapping(params = {"gender"})
    public  List<Employee> getByGender (@RequestParam String gender) {
        return employeesRepository.findByGender(gender);
    }

}
