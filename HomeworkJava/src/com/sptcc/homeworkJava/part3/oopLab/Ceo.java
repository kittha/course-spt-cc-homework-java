package com.sptcc.homeworkJava.part3.oopLab;

public class Ceo extends Employee {

	public Ceo(int employeeIdInput, String citizenIdInput, int salaryInput, String positionInput) {
		super(employeeIdInput, citizenIdInput, salaryInput, positionInput);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
//		super.hello();
		System.out.printf("*** THIS COME FROM OVERRIDING hello() METHOD *** \n=> CEO %s READY!. Hi, Everyone! <=\n", this.getFullname());
	}
	
}
