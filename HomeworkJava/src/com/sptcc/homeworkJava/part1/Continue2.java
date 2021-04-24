package com.sptcc.homeworkJava.part1;
//SPT CC HOMEWORK JAVA PART1 LAB10
//CONTINUE FOR LOOP: PRINT 1 TO 10 BUT SKIP 2

public class Continue2 {
	public static void main(String [] args) {
		for (int i = 1; i < 11; i++) {
			if(i == 2) {
				System.out.println("SKIP: " + i);
				continue;
			}
			System.out.println(i);
		}
	}
}
