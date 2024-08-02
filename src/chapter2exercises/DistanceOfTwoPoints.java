package chapter2exercises;

import java.util.Scanner;

public class DistanceOfTwoPoints {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập diểm A(x1, y1): "); //1.5 -3.4
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Nhập điểm B(x2, y2): "); //4 5
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double AB = Math.sqrt( (Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)) );
		System.out.println("khoảng cách 2 điểm là: " + AB);
		
		
		input.close();
	}

}
