package com.employee.dto;

import java.io.Serializable;

public class EmployeeDetailDto implements Serializable {

    private long id;
    private String employeeName;
    private double salary;

    public EmployeeDetailDto(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDetailDto{" +
                "employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
