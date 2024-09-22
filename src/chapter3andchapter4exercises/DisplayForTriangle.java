package chapter3andchapter4exercises;

import java.util.Scanner;

public class DisplayForTriangle {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập một số nguyên: ");
		int number = input.nextInt();
		
		System.out.println("PaternA		PaternB 	PaternC 	PaternD \n");
				
		for(int i = 1; i <= number; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			
			System.out.print("\t \t");
			for (int j = 1; j <= number - i + 1; j++) {
                System.out.print(j);
            }		
			
			System.out.print("\t \t");
			for(int j = 1; j <= number - i + 1; j++) {
				System.out.print(" ");
			}
			for(int j = i; j >= 1; j-- ) {
				System.out.print(j);
			}
			
			System.out.print("\t \t");
			for(int j = number - i + 1; j > 0; j--) {
				System.out.print(j);
			}
			
			System.out.println("");
		}
		
		
		input.close();
	}
}
