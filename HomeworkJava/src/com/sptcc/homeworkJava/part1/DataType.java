package com.sptcc.homeworkJava.part1;
//SPT CC HOMEWORK JAVA PART1 LAB1
// COMMENTING, DECLARE VARIABLE WITH DIFFERENT TYPE

//1.TRY SINGLE LINE COMMENT AND MULTIPLE LINE COMMENT
//THIS IS SINGLE LINE COMMENT
/* 
* THIS IS MULTIPLE LINE COMMENT
*/

//2.DECLARE VARIABLE WITH DIFFERENT TYPE

public class DataType {
	public static void main(String[] args) {
		boolean myBool = false;
		byte myByte = 1;
		short myShort = 2;
		int myInt = 3;
		long myLong = 4l;
		char myChar = '\u0041';
		float myFloat = 5.67f;
		double myDouble = 8.9d;

		// 3.PRINT ALL VAR
		System.out.println("This is a Boolean " + myBool);
		System.out.println("This is a Byte " + myByte);
		System.out.println("This is a Short " + myShort);
		System.out.println("This is a Integer " + myInt);
		System.out.println("This is a Long " + myLong);
		System.out.println("This is a Char " + myChar);
		System.out.println("This is a Float " + myFloat);
		System.out.println("This is a Double " + myDouble);
	}
}
