package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Trainee {
	@Id
	private long traineeId;
	private String traineeName;
	private String email;
	private LocalDate birthDate;
	private float salary;
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainee(long traineeId, String traineeName, String email, LocalDate birthDate, float salary) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.email = email;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	public long getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(long traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", email=" + email + ", birthDate="
				+ birthDate + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	
	
}
