package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Trainee;
import com.example.demo.service.TraineeService;
import com.example.demo.service.TraineeServiceImpl;

@RestController
@RequestMapping("first")
public class TraineeController {
	
	@Autowired
	TraineeService service;
	
	@GetMapping("/trainees/{id}")
	public Trainee getTraineeById(@PathVariable("id") int traineeId) {
		
		return service.searchTraineeById(traineeId);
	}
	
	@GetMapping("/trainees")
	public List<Trainee> getAllTrainees(){
		return service.getAllTrainees();
	}
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/trainees")
	public Trainee addTrainee(@RequestBody Trainee trainee) {
		return service.addTrainee(trainee);
	}
	
	@DeleteMapping("/trainees/{id}")
	public void deleteTraineeById(@PathVariable("id") int traineeId) {
		
		service.deleteTraineeById(traineeId);
	}
	
	@PutMapping("/employees")
	public Trainee updateEmployee(@RequestBody Trainee employee, int traineeId) {
		
		return service.updateTrainee(employee, traineeId);
	}
	
	
	
}