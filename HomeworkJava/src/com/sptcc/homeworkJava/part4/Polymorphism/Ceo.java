package com.sptcc.homeworkJava.part4.Polymorphism;

public class Ceo extends Employee implements IWebsiteCreator {

	public Ceo(int employeeIdInput, String citizenIdInput, int salaryInput, String positionInput) {
		super(employeeIdInput, citizenIdInput, salaryInput, positionInput);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
//		super.hello();
		System.out.printf("CEO: *** THIS COME FROM OVERRIDING hello() METHOD *** \n=> CEO %s READY!. Hi, Everyone! <=\n", this.getFullname());
	}
	
	public void seminar() {
		System.out.println("CEO: Seminar!");
	}
	
	public void hire() {
		System.out.println("CEO: Hire new employee!");
	}
	
	public void golf() {
		System.out.println("CEO: Golf!");
	}
	
	public void fire() {
		System.out.println("CEO: Fire employee!");
	}

	@Override
	public void createWebsite(String template, String titleName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orderWebsite(IWebsiteCreator creator) {
		System.out.println("CEO order: " + creator + "; to create website");
		creator.createWebsite("some template", "Codecamp3");
		
	}

	
	
	
}
