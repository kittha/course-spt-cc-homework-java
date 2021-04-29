package com.sptcc.homeworkJava.part4.AbstractClass;
import java.util.Scanner;

final public class Human extends Mammal {
	final double pi = 3.141592653589793238462643383279502884197169399375105820974944592307816406286;
	MaritalStatus myMaritalStatus = MaritalStatus.SINGLE;
	
	final public void calcCircleArea(float radius) {
//		System.out.println(""+ radius + "The circle area is: " + pi*(radius*radius));
		System.out.printf("The radius is: %f; The circle area is: %f\n", radius, pi*(radius*radius));
	}
	
	@Override
	public void breastfeed() {
		// TODO Auto-generated method stub
//		super.breastfeed();
		System.out.println("Can or Can't breastfeed.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
//		super.eat();
		System.out.println("Eat anything in front of me.");
	}

	@Override
	public void poop() {
		// TODO Auto-generated method stub
//		super.poop();
		System.out.println("Produce poop 1 ea.");
	}

	final public void intransigent() {
		System.out.println("This is final method intransigent() from final class. Don't overrided method or extended class!");
	}
	
	final public void antiEvolution() {
		System.out.println("This is final method antiEvolution() from final class. Don't overrided method or extended class!");
	}
	
	public void setMaritalStatus() {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
		    System.out.println("Choose option between 1 and 4");
		    choice = sc.nextInt();
		} while((choice > 4 || choice < 1));
		
		switch (choice) {
		case 1:
			this.myMaritalStatus = MaritalStatus.SINGLE;
			System.out.println("Marital status set to: single!");
			break;
		case 2:
			this.myMaritalStatus = MaritalStatus.MARRIED;
			System.out.println("Marital status set to: married!");
			break;
		case 3:
			this.myMaritalStatus = MaritalStatus.DIVORCED;
			System.out.println("Marital status set to: divorced.");
			break;
		case 4:
			this.myMaritalStatus = MaritalStatus.WIDOWED;
			System.out.println("Marital status set to: widowed");
			break;
		}
	}
	
	public void chkMaritalStatus() {
//		System.out.println(myMaritalStatus);
		switch (myMaritalStatus) {
		case SINGLE:
			System.out.println("I'm single!");
			break;
		case MARRIED:
			System.out.println("I'm married!");
			break;
		case DIVORCED:
			System.out.println("I was divorced.");
			break;
		case WIDOWED:
			System.out.println("I'm widowed");
			break;
		}
	}


}
