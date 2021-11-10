package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TraineeRepo;
import com.example.demo.exception.DuplicateTraineeException;
import com.example.demo.exception.TraineeNotFoundException;
import com.example.demo.model.Trainee;



@Service
public class TraineeServiceImpl implements TraineeService {
	
	@Autowired
	private TraineeRepo repo;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		if(repo.existsById(trainee.getTraineeId())) {
			throw new DuplicateTraineeException("Duplicate ID- ["+trainee.getTraineeId()+"]" + "already exists");
		}
		return repo.save(trainee);
	}
	

	
	@Override
	public Trainee deleteTraineeById(long traineeId) {
		if(!repo.existsByTraineeId(traineeId)){
            throw new TraineeNotFoundException("Trainee Not found using Trainee-ID: "+traineeId);
        }
        return repo.findById(traineeId).get();
    }
		 
		 //what to got if need to get the trainee also
	

	@Override
	public Trainee updateTrainee(Trainee trainee,int traineeId) {
		if(!repo.existsByTraineeId(trainee.getTraineeId())){
            throw new TraineeNotFoundException("Trainee Not found using Trainee-Id: "+trainee.getTraineeId());
        }

        return repo.save(trainee);
    
		
	}

	@Override
	public Trainee searchTraineeById( long traineeId) {
			
		return repo.findById(traineeId).get();
		}
		
	

	@Override
	public List<Trainee> getAllTrainees() {
		
		return repo.findAll();
	}



	@Override
	public Trainee getTraineeByName(String string) {
		  if(!repo.existsByTraineeName(string)){
	            throw new TraineeNotFoundException("Trainee Not found using Trainee-Name: "+string);
	        }
	        return repo.findTraineeByTraineeName(string);

	    
		
	}

	
	

	
	

}
