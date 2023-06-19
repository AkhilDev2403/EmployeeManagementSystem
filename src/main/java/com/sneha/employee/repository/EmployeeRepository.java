package com.sneha.employee.repository;

import com.sneha.employee.enitity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

    @Query(value = "select * from employee where email =?1", nativeQuery = true)
    Optional<String> findByEmail(String email);
}
