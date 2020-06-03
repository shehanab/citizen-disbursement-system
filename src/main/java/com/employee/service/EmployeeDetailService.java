package com.employee.service;

import com.employee.dto.EmployeeDetailDto;

import java.io.IOException;
import java.util.List;

public interface EmployeeDetailService {

    List<EmployeeDetailDto> getEmployeeDetails() throws IOException;

    List<EmployeeDetailDto> getEmployeeDetailsBySalary(String salary) throws IOException;
}
