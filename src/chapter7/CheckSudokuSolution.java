package chapter7;

import java.util.Scanner;

public class CheckSudokuSolution {

	public static int[][] readASolution() {

		Scanner input = new Scanner(System.in);

		int[][] arr = new int[9][9];
		System.out.println("Enter a Sudoku puzzle solution:");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = input.nextInt();
			}
		}

		input.close();
		return arr;
	}

	public static boolean isValid(int i, int j, int[][] arr) {

		for (int col = 0; col < 9; col++) {
			if (col != j && arr[i][col] == arr[i][j]) {
				return false;
			}
		}

		for (int row = 0; row < 9; row++) {
			if (row != i && arr[row][j] == arr[i][j]) {
				return false;
			}
		}

		for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
			for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++) {
				if (row != i && col != j && arr[row][col] == arr[i][j]) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean isValid(int[][] arr) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (arr[i][j] < 1 || arr[i][j] > 9 || isValid(i, j, arr)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int[][] arr = readASolution();
		
		System.out.println(isValid(arr) ? "Valid solution" : "Invalid solution");
	}
}
