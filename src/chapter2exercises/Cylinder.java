package chapter2exercises;

import java.util.Scanner;

public class Cylinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập bán kính: ");
		double radius = input.nextDouble();
		
		double PI = Math.PI;
		
		System.out.print("Nhập chiều cao: ");
		double length = input.nextDouble();
		
		double  area = radius * radius * PI;
		System.out.println("Diện tích hình trụ là: " + area);
		
		double volume = area * length;
		System.out.println("Thể tích của hình trụ là: " + volume);
		
		input.close();
	}
}
