package chapter7;

import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		System.out.println("Exam1: Sum");
		int total = 0;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = (int) (Math.random() * 100);

				total += arr[row][col];
			}
		}
		System.out.println("print array: " + Arrays.deepToString(arr));
		System.out.println("Total array is: " + total);

		System.out.println("\nExam2: Summing elements by column");
		int[][] arr1 = new int[5][5];

		for (int col = 0; col < arr1[0].length; col++) {
			
			int total1 = 0;
			
			for (int row = 0; row < arr1.length; row++) {
				arr1[row][col] = (int) (Math.random() * 100);
				total1 += arr1[row][col];
			}
			System.out.println("Sum for colum " + col + " is " + total1);
		}

	}

}
