package com.sptcc.homeworkJava.part1;
//SPT CC HOMEWORK JAVA PART1 LAB2
// VARIABLE SCOPE, PRIMITIVE CONVERSION, FINAL VAR



public class Variable {
	static float myfloat = 12.34f;
	static int myInt = 567;
	static double myDouble = 890d;
	static char myChar = '\u0041';
	
  public static void main(String [] args) {
	  bark();
	  convertPrimitive();
	  finalVarTestDrive();
  }
  
  //1.CREATE METHOD BARK, USE MAIN TO CALL BARK(), SET LOCAL VAR IN BARK METHOD
  public static void bark() {
	  String dogName = "Toob";
	  System.out.printf("The Dog name = %s bark\n", dogName);
  }
  
  //2.TRY PRIMITIVE CONVERSION THEN PRINT OUTPUT
  public static void convertPrimitive() {
	  System.out.println("float " + myfloat + " -> " + "int " + (int)myfloat);
	  System.out.println("int " + myInt + " -> " + "float " + (float)myInt);
	  System.out.println("double " + myDouble + " -> " + "float " + (float)myDouble);
	  System.out.println("char (ASCII Hx) " + myChar + " -> " + "int (ASCII Dec) " + (int)myChar);
  }
  
  //3.DECLARE FINAL THEN TRY TO REASSIGN FINAL VAR
  public static void finalVarTestDrive() {
	  final String hello = "Hello";
	  System.out.println(hello);
	  // hello = "World";
	  System.out.println(hello); // Error: Unresolved compilation problem
  }
}
