package com.sptcc.homeworkJava.part1;
//SPT CC HOMEWORK JAVA PART1 LAB3

//UNARY OPERATORS POSTFIX INCREMENT/PREFIX DECREMENT, CONDITIONAL OPERATORS

public class Operators {
	static int i = 20;

	public static void main(String[] args) {
		postfixIncrement();
		prefixDecrement();
		conditionalTest();
	}

	// 1.TRY USING UNARY OPERATOR
	// 1.1.POSTFIX INCREMENT
	public static void postfixIncrement() {
		for (int j = 0; j < 5; j++) {
			i++;
			System.out.println(i);
		}
		System.out.println("postfixIncrement sum is: " + i);
	}

	// 1.2.PREFIX DECREMENT
	public static void prefixDecrement() {
		for (int j = 0; j < 5; j++) {
			--i;
			System.out.println(i);
		}
		System.out.println("prefixDecrement sum is: " + i);
	}

	public static void conditionalTest() {
		float myFloat1 = 1.23f;
		float myFloat2 = 4.56f;

		char myChar1 = '\u0041'; // ASCII HEX
		char myChar2 = '\u005A'; // ASCII HEX

		// 2.CONDITIONAL OPERATORS: USING && WITH FLOAT
		if ((myFloat1 == 1.23f) && (myFloat2 == 4.56f)) {
			System.out.println("myFloat1 is 1.23 AND myFloat2 is 4.56");
		}

		// 3.CONDITIONAL OPERATORS: USING || WITH CHAR
		if ((myChar1 == 65) || (myChar2 == 90)) {
			System.out.println(myChar1 + " OR " + myChar2);
			System.out.println("myChar1 ASCII Dec is 65 OR myChar2 ASCII Dec is 90");
		}
	}

}
