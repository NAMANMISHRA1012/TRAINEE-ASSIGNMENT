package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Trainee;

public interface TraineeService {
	public Trainee addTrainee(Trainee trainee);
	public Trainee deleteTraineeById(long traineeId);
	public Trainee updateTrainee(Trainee trainee,int traineeId);
	public Trainee searchTraineeById(long traineeId);
	public List<Trainee> getAllTrainees();
	public Trainee getTraineeByName(String string);

}
