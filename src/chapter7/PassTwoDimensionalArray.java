package chapter7;

import java.util.Scanner;

public class PassTwoDimensionalArray {

	public static int[][] getArray() {

		Scanner input = new Scanner(System.in);

		int[][] m = new int[3][4];

		System.out.println("Enter " + m.length + " row and " + m[0].length + " colum: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextInt();
			}
		}
		
		input.close();

		return m;
	}

	public static int sum(int[][] m) {
		int total = 0;

		for (int row = 0; row < m.length; row++) {
			for (int col = 0; col < m[0].length; col++) {
				total += m[row][col];
			}
		}
		return total;
	}

	public static void main(String[] args) {

		int[][] m = getArray();
		
		System.out.println("Sum of all element is " + sum(m));

	}

}
