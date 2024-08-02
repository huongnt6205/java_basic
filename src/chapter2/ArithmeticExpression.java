package chapter2;

import java.util.Scanner;

public class ArithmeticExpression {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap a: ");
		double a = input.nextDouble();
		System.out.print("Nhap b: ");
		double b = input.nextDouble();
		System.out.print("Nhap c: ");
		double c = input.nextDouble();
		
		double result = ( -b + Math.sqrt( Math.pow(b, 2) - 4 * a * c))/ ( 2 * a );
		System.out.println("kết quả của phép tính là: " + result);
		
		input.close();
	}

}
