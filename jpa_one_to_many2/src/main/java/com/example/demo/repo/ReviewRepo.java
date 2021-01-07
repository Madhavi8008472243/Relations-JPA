package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entities.Review;
@Repository
public interface ReviewRepo extends JpaRepository<Review,Integer>{

}
