package chapter5;

import java.util.Scanner;

public class DisplayPatterns {

	public static void displayPattens(int n) {
		
		for(int i = 1; i <= n; i++) {
			
			for(int k = n; k > i;k--) {
				System.out.print("  ");
			}
			for(int j = i; j >= 1; j--) {
				System.out.printf("%-2d",j);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("NHập một số nguyên: ");
		int number = input.nextInt();
		
		displayPattens(number);
		
		input.close();
	}
}
