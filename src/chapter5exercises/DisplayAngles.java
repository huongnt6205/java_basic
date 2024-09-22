package chapter5exercises;

import java.util.Scanner;

public class DisplayAngles {

	public static double length(double x1, double y1, double x2, double y2) {
		//công thức tính dộ dài: d = sqrt((x2 - x1)^2 + (y2 - y1)^2);
		
		double d = Math.sqrt((Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2));
		
		return d;
	}
	
	public static void printAngles(double x1, double y1, double x2, double y2, double x3, double y3) {
		
		double AB = length(x1, y1, x2, y2);
		double BC = length(x2, y2, x3, y3);
		double AC = length(x1, y1, x3, y3);
		
		
		double A = Math.toDegrees(Math.acos((AB * AB - BC * BC - AC * AC) / ((-2) * BC * AC)));
		double B = Math.toDegrees(Math.acos((BC * BC - AB * AB - AC * AC) / ((-2) * AB * AC)));
		double C = Math.toDegrees(Math.acos((AC * AC - BC * BC - AB * AB) / ((-2) * AB * BC)));
		
		System.out.printf("Số đo của ba góc là: %.2f %.2f %.2f", A, B , C);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Nhập tọa độ (x1,y1) của điểm A: "); //1; 1
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Nhập tọa độ (x2,y2) của điểm B: "); //6.5; 1
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.print("Nhập tọa độ (x3,y3) của điểm C: "); //6.5 2.5
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		printAngles(x1, y1, x2, y2, x3, y3); //15.26 90.0 74.74
		
		input.close();
	}
	
}
