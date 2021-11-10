package com.example.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Trainee;


public interface TraineeRepo  extends JpaRepository<Trainee,Long>{
	
	public Trainee findTraineeByTraineeName(String name);
	   public boolean existsByTraineeId(Long id);
	   public boolean existsByTraineeName(String name);

	   public boolean existsByEmail(String email);
	
}
