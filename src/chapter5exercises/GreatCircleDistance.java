package chapter5exercises;

import java.util.Scanner;

public class GreatCircleDistance {

	public static double degreeToRadian(double degree) {

		return Math.toRadians(degree);

	}

	public static double distanceBetweenTwoPoint(double radius, double x1, double y1, double x2, double y2) {

		double radianX1 = degreeToRadian(x1);
		double radianX2 = degreeToRadian(x2);
		double radianY1 = degreeToRadian(y1);
		double radianY2 = degreeToRadian(y2);

		double distance = radius * Math.acos(Math.sin(radianX1) * Math.sin(radianX2)
				+ Math.cos(radianX1) * Math.cos(radianX2) * Math.cos(radianY1 - radianY2));
		
		// d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

		return distance;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Nhập tọa độ x1 điểm thứ nhất(degree): "); // 39.55
		double x1 = input.nextDouble();
		System.out.print("Nhập tọa độ y1 điểm thứ nhất(degree): "); // -116.25
		double y1 = input.nextDouble();

		System.out.print("Nhập tọa độ x2 điểm thứ hai(degree): "); // 41.5
		double x2 = input.nextDouble();
		System.out.print("Nhập tọa độ y2 điểm thứ hai(degree): "); // 87.37
		double y2 = input.nextDouble();

		double radius = 6371.01; // 6,371.01 km

		System.out.println("Khoảng cách giữa hai điểm là: " + distanceBetweenTwoPoint(radius, x1, y1, x2, y2) + "km");// 10691.79183231593 km

		input.close();
	}

}
