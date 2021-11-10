package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Trainee;

public interface TraineeService {
	public Trainee addTrainee(Trainee trainee);
	public Trainee deleteTraineeById(int traineeId);
	public Trainee updateTrainee(Trainee trainee,int traineeId);
	public Trainee searchTraineeById(int traineeId);
	public List<Trainee> getAllTrainees();

}
