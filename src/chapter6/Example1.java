package chapter6;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
//		var a = new int[] {};
		
		Scanner input = new Scanner(System.in);
		
		int[] myArray = new int[10];
		
			for(int i = 0; i < myArray.length; i++) {
				myArray[i] = input.nextInt();
			}
		
			for(int i = 0; i < myArray.length; i++) {
				System.out.print(myArray[i] + " ");
			} 

			input.close();
		
		/**
		
		 */
		
		
		double total = 0;
		
		for(int i = 0; i < myArray.length; i++) {
			total += myArray[i];
		}
		System.out.println("\nTotal is: " + total);
		
		
		double max = myArray[0];
		
		int indexOfMax = 0;
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] > max) {
				max = myArray[i];
				
				indexOfMax = i;
			}
		}
		System.out.println("Max is " + max);
		
		System.out.println("Index of max is: " + indexOfMax);
	}
}
