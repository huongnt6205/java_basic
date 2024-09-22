package chapter6exercises;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestElement {
	
	public static double printSmall(double[] array) {
		double small = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(small > array[i]) {
				small = array[i];
			}
		}
		return small;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		double[] array = new double[10];
		System.out.print("Enter ten numbers: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		
		System.out.println(Arrays.toString(array));
		
		
		double small = printSmall(array);
		System.out.println("The mininum Numbers is: " + small);
		input.close();
	}
}
