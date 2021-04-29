package com.sptcc.homeworkJava.part4.AbstractClass;

public class HumanTestDrive {
	public static void main(String [] args) {
		Human dang = new Human();
		dang.calcCircleArea(2);
		dang.antiEvolution();
		dang.intransigent();
		System.out.println(dang.myMaritalStatus);
		dang.chkMaritalStatus();
		System.out.println("********************");
		
		dang.setMaritalStatus();
		System.out.println(dang.myMaritalStatus);
		dang.chkMaritalStatus();
	}

}
