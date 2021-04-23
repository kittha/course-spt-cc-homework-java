package com.sptcc.homeworkJava.part1;
//SPT CC HOMEWORK JAVA PART1 LAB4
//HANDSOME BIAS GRADER

import java.util.Scanner;

public class HandsomeGrader {
	static int score = 0;
	static boolean isHandsome = false;
	static String grade = "";

	public static void main(String[] args) {
		getUserInput();
		printGrade();
	}

	public static void getUserInput() {
		Scanner sc = new Scanner(System.in);

		// IS HANDSOME?
		System.out.println("Is student handsome? (Y/N)");
		String handsomeInput = sc.nextLine();
		if ((handsomeInput.equals("Y")) || (handsomeInput.equals("y"))) {
			isHandsome = true;
		} else {
			isHandsome = false;
		}

		// STUDENT SCORE?
		System.out.println("Student score? (0-100)");
		while (!sc.hasNext("[0-9]+")) {
			System.out.println("INPUT INTEGER ONLY!!!");
			sc.next();
		}
//		int scoreIntInput = sc.nextInt();
		String scoreStrInput = sc.next();
		int scoreIntInput = Integer.parseInt(scoreStrInput);
		if (!(scoreIntInput < 0) && !(scoreIntInput > 100)) {
			score = scoreIntInput;
		} else {
			System.out.println("PROGRAM BLOW UP");
			System.exit(1);
		}
		sc.close();
	}

	public static void printGrade() {
		if (isHandsome == true) {
			grade = "Good";
		} else if (score < 50) {
			grade = "fail";
		} else if (score < 80) {
			grade = "normal";
		} else {
			grade = "Good";
		}
		System.out.println("Student grade is: " + grade);

	}

}
