package chapter5exercises;

import java.util.Scanner;

public class PointPosition {

	public static double getPosition(double x0, double y0, double x1, double y1, double x2, double y2) {
		// vecotr p0p1 = |(x1 - x0, y1 - y0)|
		// vector p0p2 = |(x2 - x0, y2 - y0)|
		// = (x1 - x0) * (y2 - y0) = (x2 - x0) * (y1 - y0);

		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
	}

	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {

		return getPosition(x0, y0, x1, y1, x2, y2) > 0;

	}

	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return getPosition(x0, y0, x1, y1, x2, y2) == 0;
	}

	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {

		return (x2 >= Math.min(x0, x1) && x2 <= Math.max(x0, x1)) && (y2 >= Math.min(y0, y1) && y2 <= Math.max(y0, y1));
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Nhập tọa độ điểm thứ nhất p0: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();

		System.out.println("Nhập tọa độ điểm thứ nhất p1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.println("Nhập tọa độ điểm thứ nhất p2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
			System.out.println("p2 nằm bên trái đường thẳng từ p0 đến p1.");
		} else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
			if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
				System.out.println("p2 nằm trên đoạn thẳng từ p0 đến p1.");
			} else {
				System.out.println("p2 nằm trên cùng một đường thẳng từ p0 đến p1 nhưng không nằm trên đoạn thẳng.");
			}
		} else {
			System.out.println("p2 nằm bên phải đường thẳng từ p0 đến p1.");
		}
		input.close();
	}
}
