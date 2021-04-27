package com.sptcc.homeworkJava.part4.Polymorphism;

public class Employee {
	public int employeeId;
	public String citizenId;
	private int salary;
	public String firstname;
	public String lastname;
	public String position;
	
	
	public Employee() {
		this.employeeId = 0;
		this.citizenId = "N/A";
		this.salary = 0;
		this.position = "N/A";
	}
	
	//CONSTRUCTOR OVERLOADING
	public Employee(int employeeIdInput, String citizenIdInput ,int salaryInput, String positionInput) {
		this.employeeId = employeeIdInput;
		this.citizenId = citizenIdInput;
		this.salary = salaryInput;
		this.position = positionInput;
	}
	
	
	
	public void setName(String firstnameInput, String lastnameInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
	}
	
	public void setPosition(String positionInput) {
		position = positionInput;
	}
	
	
	
	public void checkPosition() {
		System.out.println(position);
	}
	
	public String getFullname() {
		return this.firstname + " " + this.lastname;
	}

	public String getPosition() {
		return this.position;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void hello() {
		System.out.println("Employee: Hello employee ID: " + this.employeeId);
	}

}