package chapter3andchapter4exercises;

import java.util.Scanner;

public class SumAFactorialSeries {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập một số nguyên: ");
		int number = input.nextInt();
		
		double e = 1;
		double term = 1;
		
		for(int i = 1; i <= number; i++) {
			
			double factorial = 1;
			for(int j = 1; j <= i; j++) {
				factorial *= j;
			}
			term *= i /factorial;
			e += term;
		}
		System.out.println("Tổng của chuỗi giai thừa là: " + e);
		
		input.close();
	}

}
