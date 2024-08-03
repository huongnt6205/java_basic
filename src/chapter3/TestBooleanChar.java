package chapter3;

import java.util.Scanner;

public class TestBooleanChar {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/***3.23************/
		System.out.print("Nhập 1 ký tự (A, p, E, 5):");
		char ch = input.next().charAt(0);
		
		if((ch >= 'A') && (ch <= 'Z')) {
			System.out.println("true!");
		}else {
			System.out.println("false!");
		}	
//		boolean result = (ch >= 'A') && (ch <= 'Z');
//		System.out.println(result);
		
		/***3.24************/
		System.out.print("Nhập x, y, z: "); //2 3 6
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		System.out.println("result of (x < y && y < z) is " + (x < y && y < z));
		System.out.println("result of (x < y || y < z) is " + (x < y || y < z));
		System.out.println("result of !(x < y) is " + !(x < y));
		System.out.println("result of (x + y < z) is " + (x + y < z));
		System.out.println("result of (x + y < z) is " + (x - y < z));	
		
		input.close();
	}
}
