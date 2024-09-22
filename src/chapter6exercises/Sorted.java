package chapter6exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted {

	public static boolean isSorted(int[] array) {

		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] array = new int[10];
		System.out.print("Enter ten numbers: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		System.out.println(Arrays.toString(array));

		if (isSorted(array)) {
			System.out.println("The array is sorted.");
		} else {
			System.out.println("The array is not sorted.");
		}

		input.close();
	}
}
