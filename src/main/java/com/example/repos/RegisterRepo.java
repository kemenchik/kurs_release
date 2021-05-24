package com.example.repos;


import com.example.entities.Register;
import com.example.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RegisterRepo extends CrudRepository<Register, Integer> {

    Iterable<Register> findAllByUser(User user);
}
