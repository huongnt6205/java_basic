package chapter5exercises;

import java.util.Scanner;

public class MyTriangle {

	public static boolean isValid(double side1, double side2, double side3) {
		return true;
	}
	
	public static double area(double side1, double side2, double side3) {
		
		double s = (side1 + side2 + side3) / 2; 
		double area = Math.sqrt( s * (s - side1) * (s - side2) * (s - side3));
		
		return area;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập tọa độ của side1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Nhập tọa độ của side2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.print("Nhập tọa độ của side3: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double side1 = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)) );
		double side2 = Math.sqrt((Math.pow(x3 - x2, 2)) + (Math.pow(y3 - y2, 2)) );
		double side3 = Math.sqrt((Math.pow(x1 - x3, 2)) + (Math.pow(y1 - y3, 2)) );
		
		System.out.printf("Diện tich của tam giác là: %.1f ", area(side1, side2, side3));
		
		input.close();
	}
}
