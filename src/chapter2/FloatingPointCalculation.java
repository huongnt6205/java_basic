package chapter2;

import java.util.Scanner;
public class FloatingPointCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap m: ");
		int m = input.nextInt();
		System.out.print("Nhap r: ");
		int r = input.nextInt();
		
		double result1 = m * Math.pow(r, 2);
		System.out.println("Cách 1: Su dung 'pow' chuyen so nguyen thanh so thuc : " + result1);
		double result2 = (double) m * r * r;
		System.out.println("Cach 2: Chuyen m thanh so thuc " + result2 );
		double rDouble = (double) r;
		double result3 = m * rDouble * rDouble;
		System.out.println("Cach 3: Chuyem r thanh so thuc " + result3);
		
		input.close();
	}

}
