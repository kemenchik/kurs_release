package com.example.repos;


import com.example.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
    Employee findByCount(Integer id);
}
