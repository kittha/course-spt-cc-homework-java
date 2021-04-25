package com.sptcc.homeworkJava.part2;
//SPT CC HOMEWORK JAVA PART2 LAB13 OL1-2
//TWO DIMENSION ARRAY
//OL1 CREATE 2D ARRAY THEN PRINT
//OL2 GET VALUE FROM LAST INDEX OF EACH ROW; SUM ALL; THEN PRINT

public class Lab13TwoDimensionArray {
	public static void main(String [] args) {
		int my2DArray[][] = {
				{1,2,3},{4,5,6,7},{8,9}
		};
		printTwoDimensionArray(my2DArray);
		sumLastIndexOfTwoDimensionArray(my2DArray);
	}
	
	//OL1 CREATE 2D ARRAY THEN PRINT
	public static void printTwoDimensionArray(int[][] TwoDimensionArray) {
		System.out.println("OL1 CREATE 2D ARRAY THEN PRINT");
		System.out.println("2D Printer Start!");
		for (int[] row : TwoDimensionArray) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.print("\n");
		}
		System.out.println("2D Printer End!");
		System.out.println("********************");
	}
	
	//OL2 GET VALUE FROM LAST INDEX OF EACH ROW; SUM ALL; THEN PRINT
	public static void sumLastIndexOfTwoDimensionArray(int[][] TwoDimensionArray) {
		System.out.println("OL2 GET VALUE FROM LAST INDEX OF EACH ROW; SUM ALL; THEN PRINT");
		int sum = 0;
		for (int[] row : TwoDimensionArray) {
			sum += row[row.length-1];
		}
		System.out.println("SUM OF LAST INDEX VALUES OF EACH ROW IS: " + sum);
		System.out.println("********************");
	}

}
