package chapter6exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ComputeDeviation {
	
	public static double deviation(double[] array, double mean) {
		
		double sumSquared = 0;
		
		for(double i : array) {
			sumSquared += Math.pow(i - mean, 2);
		}
		double deviation = Math.sqrt(sumSquared / (array.length - 1));
		
		return deviation;
	}
	
	public static double mean(double[] array) {
		
		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double mean = sum / array.length;
		return mean;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] array = new double[10];
		System.out.print("Enter ten numbers: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		
		System.out.println(Arrays.toString(array));
		
		double mean = mean(array);
		System.out.println("mean is: " + mean);
		
		double deviation = deviation(array, mean);
		System.out.println("devision is: " + deviation);

		input.close();
	}
	
}
