package com.sptcc.homeworkJava.part1;
//SPT CC HOMEWORK JAVA PART1 LAB7 OL2
//DO WHILE LOOP: IF NUM IS EVEN THEN STUCK IN LOOP; IF NUM IS ODD THEN EXIT FROM LOOP

import java.util.Scanner;

public class DoWhile2 {
	public static void main(String [] args) {
		oddValidator();
	}
	
	public static int getUserIntInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input integer: ");
		while (!sc.hasNext("[0-9]+")) {
			System.out.println("INPUT INTEGER ONLY!!!");
			sc.next();
		}
		return sc.nextInt();
	}
	
	public static void oddValidator() {
		int userIntInput = 0;
		do {
			userIntInput = getUserIntInput();
		} while (userIntInput % 2 == 0);
		System.out.println("User input: " + userIntInput + " which is ODD number");
	}

}
