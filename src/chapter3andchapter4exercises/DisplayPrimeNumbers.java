package chapter3andchapter4exercises;

import java.util.Scanner;

public class DisplayPrimeNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập số nguyên bắt đầu để tìm số nguyên tố: ");
		int numberStart = input.nextInt();
		
		System.out.print("Nhập số nguyên cuối để tìm số nguyên tố: ");
		int numberEnd = input.nextInt();
		
		int count = 0; 
		
		for(int i = numberStart; i <= numberEnd; i++) {
			if( i < 2) {
				continue;
			}
			
			int divisorCount = 0;
		
			for(int j = 2; j * j <= i ; j++) {
				if(i % j == 0) {
					divisorCount++;
					break;
				}
			}
				
			if(divisorCount == 0) {	
				System.out.printf("%5d", i);

				count++;
				if(count % 8 == 0) {
					System.out.println();
				}
			}
		}
		
		input.close();
	}

}
