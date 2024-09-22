package chapter6exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void revserve(int[] array) {
		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;

			left++;
			right--;
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] array = new int[10];
		System.out.print("Enter ten numbers: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		System.out.println(Arrays.toString(array));

		revserve(array);
		System.out.println(Arrays.toString(array));
		
		input.close();
	}
}
