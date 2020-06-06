package com.employee.service;

import com.employee.dto.EmployeeDetailDto;

import java.io.IOException;
import java.util.List;

/**
 * Service class for managing EmployeeDetailService
 *
 * @author Shehan
 */
public interface EmployeeDetailService {

    /**
     * Method to fetch all the employee data
     *
     * @return list of employee details
     * @throws IOException
     */
    List<EmployeeDetailDto> getAllEmployeeDetails() throws IOException;

    /**
     * Method to fetch employee data based on salary range
     *
     * @param salaryFrom employee starting salary
     * @param salaryTo employee ending salary
     * @return list of employee details
     * @throws IOException
     */
    List<EmployeeDetailDto> getEmployeeDetailsBySalary(String salaryFrom, String salaryTo) throws IOException;
}
