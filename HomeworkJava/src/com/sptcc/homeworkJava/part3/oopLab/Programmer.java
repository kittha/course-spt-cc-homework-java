package com.sptcc.homeworkJava.part3.oopLab;

public class Programmer extends Employee {

	public Programmer(int employeeIdInput, String citizenIdInput, int salaryInput, String positionInput) {
		super(employeeIdInput, citizenIdInput, salaryInput, positionInput);
		// TODO Auto-generated constructor stub
		System.out.println("Programmer READY!");
	}
	
	public void createWebsite(String template, String titleName) {
		System.out.printf("Creating Website from template:%s; Title:%s\n", template, titleName);
	}
	
	public void installWindows(String version, String productKey) {
		System.out.printf("Installing Windows version:%s; Key:%s\n", version, productKey);
	}
	

}
