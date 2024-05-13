package com.azr.cosmosdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AZRServices {

    @Autowired
    private EmployeeService employeeService;

    public void getEmployees(String connectionString) throws Exception {
        employeeService.getEmployees(connectionString);
    }

    
}
