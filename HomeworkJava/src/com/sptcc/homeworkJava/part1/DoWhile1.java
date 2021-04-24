package com.sptcc.homeworkJava.part1;
//SPT CC HOMEWORK JAVA PART1 LAB7 OL1
//DO WHILE LOOP: PRINT NUM FROM 20 TO 0

public class DoWhile1 {
	
	public static void main(String [] args) {
		countdown(20, 0);
	}
	
	public static void countdown(int startNum, int stopNum) {
		do {
			System.out.println(startNum);
			startNum--;
		} while (startNum > stopNum-1);
	}

}
