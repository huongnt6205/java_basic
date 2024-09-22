package chapter6exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumberEntered {

	public static void reverseNumber(int[] reverseArr) {

		for (int i = 0; i < reverseArr.length / 2; i++) {
			int temp = reverseArr[i];
			reverseArr[i] = reverseArr[reverseArr.length - 1 - i];
			reverseArr[reverseArr.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(reverseArr));

	}

	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] reverseArr = new int[10];

		System.out.print("Enter ten number integer: ");
		for (int i = 0; i < reverseArr.length; i++) {
			reverseArr[i] = input.nextInt();
		}

		reverseNumber(reverseArr);
		System.out.println(Arrays.toString(reverseArr));
		input.close();
	}
}
