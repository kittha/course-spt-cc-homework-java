package com.sptcc.homeworkJava.part1;
//SPT CC HOMEWORK JAVA PART1 LAB8
//BREAK FOR LOOP: COUNTDOWN FROM 20; IF NUM IS 11 THEN BREAK

public class Break {
	public static void main(String [] args) {
		int count = 20;
		for (int i = count; i >= 0; i--) {
			if (i == 11) {
				System.out.println(i);
				break;
			}
			System.out.println("SKIP: " + i);
		}
	}
}
