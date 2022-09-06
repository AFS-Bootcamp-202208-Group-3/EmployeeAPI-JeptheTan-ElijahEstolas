package com.rest.springbootemployee;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private Integer employeeID;
    private String employeeName;
    private Integer age;
    private String gender;
    private Integer salary;

    public Employee (Integer employeeID, String employeeName, Integer age, String gender, Integer salary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this. age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getEmployeeID () {
        return employeeID;
    }

    public String getEmployeeName () {
        return employeeName;
    }

    public int getAge () {
        return age;
    }

    public String getGender () {
        return gender;
    }

    public int getSalary () {
        return salary;
    }

    public void setEmployeeID (Integer employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName (String employeeName) {
        this.employeeName = employeeName;
    }

    public void setAge (Integer age) {
        this.age = age;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }

    public void setSalary (Integer salary) {
        this.salary = salary;
    }
}
