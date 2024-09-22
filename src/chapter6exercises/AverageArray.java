package chapter6exercises;

import java.util.Scanner;

public class AverageArray {

	public static int average(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		int average = sum / array.length;

		return average;
	}

	public static double average(double[] array) {

		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double average = sum / array.length;

		return average;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double[] array = new double[10];
		System.out.print("Enter ten number Integer: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		int averageInt = (int) average(array);
		System.out.println("Gia tri trung binh khi su dung phuong phuc Int la: " + averageInt);

		double averageDouble = average(array);
		System.out.println("Gia tri trung binh khi su dung phuong thuc Double la: " + averageDouble);

		input.close();
	}
}
