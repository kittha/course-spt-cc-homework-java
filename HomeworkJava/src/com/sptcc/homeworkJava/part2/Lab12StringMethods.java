package com.sptcc.homeworkJava.part2;
//SPT CC HOMEWORK JAVA PART2 LAB12 OL1-7
//USE STRING METHODS: .equals() .contains() .length() .substring() .trim() .toLowerCase() .toUpperCase()

import java.util.Scanner;

//OL1: USE .equals() TO COMPARE STRING
//OL2: USE .contains() TO SEARCH WORD IN STRING THEN PRINT SEARCH RESULT
//OL3: USE .length() THEN PRINT LENGTH
//OL4: USE .substring() CUT INDEX 1-4
//OL5: DELETE SPACE BETWEEN SENTENCE
//OL6: USE .toUpperCase()
//OL7: USE METHOD CHAINING TO SET String2 .trim() .toUpperCase()

public class Lab12StringMethods {
	public static void main(String [] args) {
		String String1 = "You and Me";
		String String2 = " you and me ";
		ol1CompareString(String1, String2); // false
//		ol2SearchWord(getUserStrInput(), String1); // DEPEND ON USER INPUT 
		ol2SearchWord("You", String1); // FOUND
		ol2SearchWord("Cat", String1); // NOT FOUND
		ol3ChkLength(String1); // 10
//		ol4CutText(getUserIntInput(), getUserIntInput(), String1); // DEPEND ON USER INPUT
		ol4CutText(1, 4, String1); // Ynd Me
		ol5RemoveSpace(String1); // YouandMe
		ol6changeToUpperCase(String1); // YOU AND ME
		ol7TrimAndUpperCase(String2); // YOU AND ME
	}
	
	public static String getUserStrInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("INPUT SEARCH KEYWORD: ");
		String keyword = sc.nextLine();
		sc.close();
		return keyword;
	}
		
	public static int getUserIntInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("INPUT INT: ");
		while (!sc.hasNext("[0-9]+")) {
			System.out.println("INPUT INTEGER ONLY!!!");
			sc.next();
		}
		int userIntInput = sc.nextInt();
//		sc.close();
		return userIntInput;
	}
	
	//OL1: USE .equals() TO COMPARE STRING
	public static void ol1CompareString(String str1, String str2) {
		System.out.println("OL1: USE .equals() TO COMPARE STRING");
		boolean isEqual = str1.equals(str2);
		System.out.println("Is String1 equal to String2: " + isEqual);
		System.out.println("********************");
	}
	
	//OL2: USE .contains() TO SEARCH WORD IN STRING THEN PRINT SEARCH RESULT
	public static void ol2SearchWord(String keyword, String givenText) {
		System.out.println("OL2: USE .contains() TO SEARCH WORD IN STRING THEN PRINT SEARCH RESULT");
		boolean isFound = givenText.contains(keyword);
		if (isFound == true) {
			System.out.println("KEYWORD: " + keyword + " FOUND.");
		} else {
			System.out.println("xxx KEYWORD: " + keyword + " NOT FOUND! xxx");
		}
		System.out.println("********************");
	}
	
	//OL3: USE .length() THEN PRINT LENGTH
	public static void ol3ChkLength(String givenString) {
		System.out.println("OL3: USE .length() THEN PRINT LENGTH");
		System.out.println(givenString + " lenghth is: " + givenString.length());
		System.out.println("********************");
	}
	
	//OL4: USE .substring() CUT INDEX 1-4
	public static void ol4CutText(int startPosToCut, int stopPosToCut, String givenText) {
		System.out.printf("OL4: USE .substring() CUT INDEX %d-%d\n", startPosToCut, stopPosToCut);
		String newString = givenText.substring(0, startPosToCut) + givenText.substring(stopPosToCut+1);
		System.out.println(newString);
		System.out.println("********************");
	}
	
	//OL5: DELETE SPACE BETWEEN SENTENCE
	public static void ol5RemoveSpace(String givenString) {
		System.out.println("OL5: DELETE SPACE BETWEEN SENTENCE");
		String newString = givenString.replaceAll("\\s", "");
		System.out.println(newString);
		System.out.println("********************");
	}
	
	//OL6: USE .toUpperCase()
	public static void ol6changeToUpperCase(String givenString) {
		System.out.println("OL6: USE .toUpperCase()");
		System.out.println(givenString.toUpperCase());
		System.out.println("********************");
	}
	
	//OL7: USE METHOD CHAINING TO SET String2 .trim() .toUpperCase()
	public static void ol7TrimAndUpperCase(String givenString) {
		System.out.println("OL7: USE METHOD CHAINING TO SET String2 .trim() .toUpperCase()");
		System.out.println(givenString.trim().toUpperCase());
		System.out.println("********************");
	}

}
