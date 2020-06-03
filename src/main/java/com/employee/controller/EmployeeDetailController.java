package com.employee.controller;

import com.employee.dto.EmployeeDetailDto;
import com.employee.service.EmployeeDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class EmployeeDetailController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDetailController.class);

    @Autowired
    private EmployeeDetailService employeeDetailService;

    @GetMapping(value = "/getAllEmployeeDetails")
    public ResponseEntity<List<EmployeeDetailDto>> getAllEmployeeDetails() {

        LOGGER.info("Received request to fetch employee details");
        List<EmployeeDetailDto> employeeDetails = new ArrayList<>();
        try {
            employeeDetails = employeeDetailService.getEmployeeDetails();
        } catch (IOException e) {
            LOGGER.error("Error occurred while fetching employee details", e);
        }

        return new ResponseEntity<>(employeeDetails, HttpStatus.OK);
    }


    @GetMapping(value = "/getEmployeeBySalary/{salary}")
    public ResponseEntity<List<EmployeeDetailDto>> getEmployeeBySalary(final @PathVariable String salary) throws IOException {

        LOGGER.info("Received request to fetch employee details by salary {}", salary);
        List<EmployeeDetailDto> employeeDetails = employeeDetailService.getEmployeeDetailsBySalary(salary);
        LOGGER.info("{} employees found", employeeDetails.size());
        return new ResponseEntity<>(employeeDetails, HttpStatus.OK);
    }


}
