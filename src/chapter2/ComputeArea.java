package chapter2;

import java.util.Scanner;

public class ComputeArea {

	public static void main(String[] args) {
		
//tinh chu vi va dien tich hinh tron
		
/**		double radius = 2.5;
		double area;
		double circumference; 
		double PI = 3.14159;
		
		circumference = 2 * PI * radius;
		System.out.println("Chu vi hinh tron ban kinh " + radius + " la: " + circumference );
		
		area = radius * radius *  PI;
		System.out.println("Dien tich hinh tron la: " + area);
		*/
//sử dụng Scanner để có thể nhập giá trị cho các biến.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap gia tri cua ban kinh: ");
		double radius = input.nextDouble();
		double PI = 3.14159;
		
		double circumference = 2 * radius * PI;
		System.out.println("Ban kinh hinh tron la: " + circumference);
		
		double area = radius * radius * PI;
		System.out.println("Dien tich hinh tron la: " + area);
		
		input.close();
	}

}
