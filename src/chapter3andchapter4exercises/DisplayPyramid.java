package chapter3andchapter4exercises;

import java.util.Scanner;

public class DisplayPyramid {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập một số nguyên từ 1 đến 15 để vẽ hình chóp: ");
		int number = input.nextInt();
		
		for(int i = 1; i <= number; i++) {
			
			for(int k = number; k >=i; k--) {	
				System.out.print(" ");
			}
			for(int h = i; h > 1; h-- ) {
				System.out.print(h);
			}
			
			for(int j = 1; j<= i; j++) {
				System.out.print(j+ "");
			}
			System.out.println("");
			
		}
		
		input.close();
	}

}
