package chapter2exercises;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập tọa độ điểm thứ nhất slide1(x1, y1): "); // 1.5 - 3.4
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Nhập tọa độ điểm thứ hai slide2(x2, y2): "); //4.6 5
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.print("Nhập tọa độ điểm thứ ba slide3(x3, y3): "); // 9.5 - 3.4 
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double slide1 = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)) );
		double slide2 = Math.sqrt((Math.pow(x3 - x2, 2)) + (Math.pow(y3 - y2, 2)) );
		double slide3 = Math.sqrt((Math.pow(x1 - x3, 2)) + (Math.pow(y1 - y3, 2)) );
		
		double s = (slide1 + slide2 + slide3) / 2; 
		System.out.println("Nửa chu vi ta giác là: " +s);
		
		double area = Math.sqrt( s * (s - slide1) * (s - slide2) * (s - slide3));
		System.out.println("Diện tích tam giác có là:  " + area);
		
		input.close();
	}

}
