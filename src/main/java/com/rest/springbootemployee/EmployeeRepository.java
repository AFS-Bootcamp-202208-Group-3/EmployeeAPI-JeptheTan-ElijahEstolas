package com.rest.springbootemployee;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository {

    List<Employee> employees;

    public EmployeeRepository() {
        employees = new ArrayList<>();
        employees.add(new Employee(1, "Jep", 23, "Male", 1000));
        employees.add(new Employee(1, "Jennifer", 23, "Female", 1000));
        employees.add(new Employee(1, "Ruby", 23, "Female", 1000));
    }

    public List<Employee> findAll() {
        return employees;
    }

    public Employee findById(Integer employeeID) {
        return employees.stream()
                .filter(employee -> employee.getEmployeeID() == employeeID.intValue())
                .findFirst()
                .orElseThrow(NoEmployeeFoundException::new);
    }

    public List<Employee> findByGender(String gender) {
        return employees.stream()
                .filter(employee -> {
                    return employee.getGender().equals(gender);
                })
                .collect(Collectors.toList());
    }
}
