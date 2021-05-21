package com.example.repos;


import com.example.entities.Register;
import org.springframework.data.repository.CrudRepository;

public interface RegisterRepo extends CrudRepository<Register, Integer> {
}
