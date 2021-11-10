package com.example.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Trainee;


public interface TraineeRepo  extends JpaRepository<Trainee,Integer>{
	

}
