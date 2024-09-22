package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		/* Gán giá trị */
		// cach1:

		System.out.println("Cách 1: ");
		int[][] arr = new int[4][5];

		int value = 1;
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 5; col++) {
				arr[row][col] = value;
				value++;
				System.out.printf("%3s", arr[row][col]);
			}
			System.out.println();
		}

		// cach2:
		System.out.println("\nCách 2: ");

		int[][] arr1 = new int[4][5];

		arr1[0] = new int[] { 1, 2, 3, 4, 5 };
		arr1[1] = new int[] { 6, 7, 8, 9, 10 };
		arr1[2] = new int[] { 11, 12, 13, 14, 15 };
		arr1[3] = new int[] { 16, 17, 18, 19, 20 };

		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1[row].length; col++) {
				System.out.printf("%3s", arr1[row][col]);
			}
			System.out.println();
		}

		/*
		 * for (int[] row : arr1) { 
		 * 		for (int value : row) { 
		 * 			System.out.printf("%3s", value); 
		 * 		}
		 * 	System.out.println(); 
		 * }
		 */

		// cach3:
		System.out.println("\nCách 3: ");
		
		Scanner input = new Scanner(System.in);

		int[][] arr2 = new int[4][5];

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.printf("Nhập phần tử tại hàng %d, cột %d: ", row, col);
				arr2[row][col] = input.nextInt();
			}
		}

		System.out.println("arr2 = " + Arrays.deepToString(arr2));

		input.close();
	}

}
