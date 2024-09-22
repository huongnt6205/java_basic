package sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

//	public static void bubbleSort(int[] arr) {
//
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr.length - i - 1; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//	}

	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			boolean swapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] arr = new int[10];

		System.out.print("Enter ten number Integer: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		System.out.println("Original arrays: " + Arrays.toString(arr));

		bubbleSort(arr);
		System.out.println("Sorted arrays: " + Arrays.toString(arr));

		input.close();
	}
}
