package com.sneha.employee.controller;

import com.sneha.employee.model.request.EmployeeRequestModel;
import com.sneha.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping("/add")
    public String addEmployee(@RequestBody EmployeeRequestModel requestModel){
        return service.createEmployee(requestModel);
    }
}
