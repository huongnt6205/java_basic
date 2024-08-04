package chapter4;

import java.util.Scanner;

public class SolveQuadraticEquations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập a, b, c: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if(delta > 0) {
			System.out.println("Phương trình có 2 nghiệm phân biệt! ");
			double r1 = ( -b + Math.sqrt(delta)) / (2 * a);
			double r2 = ( -b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("Nghiệm của phương trình là: %.3f và %.3f", r1, r2);
		} else if(delta < 0) {
			System.out.println("Phương tình vô nghiệm!");
		} else {
			System.out.println("Phương trình có nghiệm kép! ");
			double r = ( -b / (2 * a));
			System.out.printf("Nghiệm của phương tình ax^2 + bx + c = 0 là: %.3f ", r);
		}
		
		input.close();
	}

}
