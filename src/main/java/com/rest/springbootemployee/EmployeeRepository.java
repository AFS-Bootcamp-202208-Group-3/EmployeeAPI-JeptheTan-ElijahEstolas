package com.rest.springbootemployee;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    List<Employee> employees;

    public EmployeeRepository() {
        employees = new ArrayList<>();
        employees.add(new Employee(1, "Jep", 23, "Male", 1000));
    }
    public List<Employee> findAll () {
        return employees;
    }

    public Employee findById (Integer employeeID) {
        return employees.stream()
                .filter(employee -> employee.getEmployeeID() == employeeID)
                .findFirst()
                .orElseThrow(NoEmployeeFoundException::new);
    }

    public List<Employee> findByGender (String gender) {
        return null;
    }
}
