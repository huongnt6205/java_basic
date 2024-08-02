package chapter3;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap ban kinh: ");
		double radius = input.nextDouble();
		
		if(radius < 0) {
			System.out.println("Xin vui long nhap lai ban kinh! ");
		} else {
			double area = 3.14159 * Math.pow(radius, 2);
			System.out.println("Dien tich hinh tron la: " + area);
			
		}
		input.close();
	}
}
