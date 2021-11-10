package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TraineeRepo;
import com.example.demo.model.Trainee;



@Service
public class TraineeServiceImpl implements TraineeService {
	
	@Autowired
	private TraineeRepo repo;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		return repo.save(trainee);
	}

	@Override
	public Trainee deleteTraineeById(int traineeId) {
		Trainee trainee1=null;
		 trainee1= repo.getById(traineeId);
		 repo.deleteById(traineeId);
		 return trainee1;
		 
		 
		 //what to got if need to get the trainee also
	}

	@Override
	public Trainee updateTrainee(Trainee trainee,int traineeId) {
		if (trainee.getTraineeId()==traineeId) {
			
			return repo.save(trainee);
		}
		else {
			return repo.save(trainee);
		}
		
	}

	@Override
	public Trainee searchTraineeById(int traineeId) {
		return repo.getById(traineeId);
		
	}

	@Override
	public List<Trainee> getAllTrainees() {
		
		return repo.findAll();
	}

	
	

	
	

}
