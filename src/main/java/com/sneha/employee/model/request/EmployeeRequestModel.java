package com.sneha.employee.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestModel {

    private String firstName;

    private String lastName;

    private String email;

    private Long salary;

    private Long age;
}
