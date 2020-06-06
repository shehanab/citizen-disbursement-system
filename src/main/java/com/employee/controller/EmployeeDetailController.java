package com.employee.controller;

import com.employee.dto.EmployeeDetailDto;
import com.employee.service.EmployeeDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * REST controller for managing employee data.
 *
 * @author Shehan
 */
@RestController
@RequestMapping(value = "/api")
public class EmployeeDetailController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDetailController.class);

    @Autowired
    private EmployeeDetailService employeeDetailService;

    /**
     * Method to fetch all the employee data
     *
     * @return list of employee details
     */
    @GetMapping(value = "/employees")
    public ResponseEntity<List<EmployeeDetailDto>> getAllEmployeeDetails() {
        LOGGER.info("Received request to fetch employee details");
        List<EmployeeDetailDto> employeeDetails = new ArrayList<>();
        try {
            employeeDetails = employeeDetailService.getAllEmployeeDetails();
            LOGGER.info("{} employees found", employeeDetails.size());
            return new ResponseEntity<>(employeeDetails, HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error("Error occurred while fetching employee details", e);
            return new ResponseEntity<>(employeeDetails, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Method to fetch employee data based on salary range
     *
     * @param salaryFrom lowest employee salary to be filtered
     * @param salaryTo   highest employee salary to be filtered
     * @return list of employee details
     */
    @GetMapping(value = "/employees", params = {"salaryFrom, salaryTo"})
    public ResponseEntity<List<EmployeeDetailDto>> getEmployeeBySalary(
            final @RequestParam(value = "salaryFrom") String salaryFrom,
            final @RequestParam(value = "salaryTo") String salaryTo) {
        LOGGER.info("Received request to fetch employee details of salary between {} to {}", salaryFrom, salaryTo);
        List<EmployeeDetailDto> employeeDetails = new ArrayList<>();
        try {
            employeeDetails = employeeDetailService.getEmployeeDetailsBySalary(salaryFrom, salaryTo);
            LOGGER.info("{} employees found", employeeDetails.size());
            return new ResponseEntity<>(employeeDetails, HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error("Error occurred while fetching employee details", e);
            return new ResponseEntity<>(employeeDetails, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
