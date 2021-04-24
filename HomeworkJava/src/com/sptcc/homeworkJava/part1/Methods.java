package com.sptcc.homeworkJava.part1;
//SPT CC HOMEWORK JAVA PART1 LAB11
//METHODS VOID VS NON-VOID

public class Methods {
	public static void main(String [] args) {
		voidMethod();
		System.out.println(nonVoidMethod());
	}
	
	public static void voidMethod() {
		System.out.println("Woof! Woof!. I'M RUNNING FROM VOID METHOD.");
	}
	
	public static String nonVoidMethod() {
		String str ="THIS IS RETURNING FROM NON-VOID METHOD.";
		return str;
	}

}
