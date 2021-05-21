package com.example.repos;



import com.example.entities.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepo extends CrudRepository<Review, Integer> {
    List<Review> findAll();
    List<Review> findAllByEnabledTrue();
    Review findAllByAddressee(String addressee);
}
