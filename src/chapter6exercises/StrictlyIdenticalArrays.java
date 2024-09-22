package chapter6exercises;

import java.util.Arrays;
import java.util.Scanner;

public class StrictlyIdenticalArrays {

	private static void printCompare(int[] arr1, int[] arr2) {
		boolean identical = true;

		if (arr1.length != arr2.length) {
			identical = false;
		} else {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					identical = false;
					break;
				}
			}
		}

		if (identical) {
			System.out.println("Two lists are strictly identical.");
		} else {
			System.out.println("Two completely different lists.");
		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int size = input.nextInt();

		int[] arr1 = new int[size];
		int[] arr2 = new int[size];

		System.out.println("Enter value of array one: ");
		for (int i = 0; i < size; i++) {
			arr1[i] = input.nextInt();
		}
		System.out.println("Enter value of array two: ");
		for (int i = 0; i < size; i++) {
			arr2[i] = input.nextInt();
		}

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		printCompare(arr1, arr2);

		input.close();
	}
}
