package chapter6exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TheIndexOfThheSmallestNumber {

	public static int indexSmallNumber(int indexNunber, int[] array) {
		
		int index = indexNunber;
		
		for(int i = indexNunber + 1; i < array.length; i++) {
			if(array[index] > array[i]) {
				index = i;
			}
		}
		
		return index;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[10];
		System.out.print("Enter ten numbers: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		int index = array[0];
		System.out.println(Arrays.toString(array));
				
		System.out.println("The index of smallest numbers is " + indexSmallNumber(index, array));
		
		input.close();
	}
}
