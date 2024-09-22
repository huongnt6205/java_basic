package chapter3andchapter4exercises;

import java.util.Scanner;

public class SumASeries {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập một số nguyên: ");
		int number = input.nextInt();
		
		double sum = 0;
		
		for(double i = 1; i <= number; i += 2) {
			
			for(double j = 3; j <= i + 2; j += 2) {
				sum += (i / j);
			}
		}
		System.out.println("Tổng của chuỗi là: " + sum);
		
		input.close();

	}

}
