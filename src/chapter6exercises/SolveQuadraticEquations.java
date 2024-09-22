package chapter6exercises;

import java.util.Scanner;

public class SolveQuadraticEquations {

	public static void printSolve(int[] arr) {
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];

		int delta = b * b - 4 * a * c;

		if (delta < 0) {
			System.out.println("Unsolved equation!");
		} else if (delta == 0) {
			int x = (-b) / (2 * a);
			System.out.print("The equation has a double solution! \nx = " + x);
		} else {
			System.out.println("The equation has two distinct solutions");
			int x1 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
			int x2 = (int) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("x1 = " + x1 + "\nx2 = " + x2);
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int[] arr = { a, b, c };

		System.out.println("==> Result: ");
		printSolve(arr);

		input.close();
	}
}
