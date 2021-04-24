package com.sptcc.homeworkJava.part1;
//SPT CC HOMEWORK JAVA PART1 LAB9
//CONTINUE FOR LOOP: COUNTDOWN FROM 20; IF NUM IS 11 THEN SKIP

public class Continue1 {
	public static void main(String [] args) {
		int count = 20;
		for (int i = count; i >= 0; i--) {
			if (i == 11) {
				System.out.println(i);
				continue;
			}
		System.out.println("SKIP: " + i);
		}
	}
}
