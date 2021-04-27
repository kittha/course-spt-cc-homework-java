package com.sptcc.homeworkJava.part4.Polymorphism;

public class Programmer extends Employee implements IWebsiteCreator {

	public Programmer(int employeeIdInput, String citizenIdInput, int salaryInput, String positionInput) {
		super(employeeIdInput, citizenIdInput, salaryInput, positionInput);
		// TODO Auto-generated constructor stub
		System.out.println("Programmer: Programmer READY!");
	}
	
	public void createWebsite(String template, String titleName) {
		System.out.printf("Programmer: Creating Website from template:%s; Title:%s\n", template, titleName);
	}
	
	public void fixPc() {
		System.out.println("Programmer: Fix PC!");
	}
	
	public void installWindows(String version, String productKey) {
		System.out.printf("Programmer: Installing Windows version:%s; Key:%s\n", version, productKey);
	}
	
	@Override
	public void orderWebsite(IWebsiteCreator creator) {
		// TODO Auto-generated method stub
		
	}


	

}
