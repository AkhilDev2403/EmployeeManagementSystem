package com.sneha.employee.service;

import com.sneha.employee.enitity.EmployeeEntity;
import com.sneha.employee.model.request.EmployeeRequestModel;
import com.sneha.employee.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public String createEmployee(EmployeeRequestModel requestModel) {
        Optional<String> isMailExist = repository.findByEmail(requestModel.getEmail());
        if(isMailExist.isPresent()){
            return "Already account created";
        }
/** So instead of writing these line all the time, (suppose if we've n number of fields in the request, this would be difficult and code complexity..**/
//        EmployeeEntity entity = new EmployeeEntity();
//        entity.setFirstName(requestModel.getFirstName());
//        entity.setLastName(requestModel.getLastName());
//        entity.setEmail(requestModel.getEmail());
//        entity.setAge(requestModel.getAge());
//        entity.setSalary(requestModel.getSalary());
/** To reduce that and code optimization we use ModelMapper(). with these single line it handles all the request and move it to the destination class entity. **/
        EmployeeEntity entity = new ModelMapper().map(requestModel, EmployeeEntity.class);

        repository.save(entity);
        return "success";
    }
}
