package chapter4;

import java.util.Scanner;

public class Solve2x2LinearEquations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập a, b, c, d, e, f: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		
		if( a * d - b * c == 0) {
			System.out.println("Phương tình vô nghiệm! ");
		} else {
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			
			System.out.printf("x = %.2f và y = %.2f",x, y);
		}
		input.close();
	}

}
