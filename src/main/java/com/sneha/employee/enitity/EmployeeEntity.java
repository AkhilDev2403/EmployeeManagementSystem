package com.sneha.employee.enitity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(length = 20)
    private String firstName;

    @Column(length = 20)
    private String lastName;

    @Column()
    private Long salary;

    @Column(nullable = false, length = 20)
    private String email;

    @Column()
    private Long age;
}
