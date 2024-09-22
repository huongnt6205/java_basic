package chapter5exercises;

import java.util.Scanner;

public class AreaOfPentagon {

	public static double isAreaPentagon(double s) {
		
		double area = (5 * Math.pow(s, 2)) / (4 * Math.tan((Math.PI) / 5));
		
		return area;
	}
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập vào độ dài cạnh của hình ngũ giác: ");
		double s = input.nextDouble();
		
		System.out.println("Diện tích ngũ giác: " + isAreaPentagon(s));
		
		input.close();
	}
}
