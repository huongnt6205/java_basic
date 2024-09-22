package chapter5exercises;

import java.util.Scanner;

public class AreaOfRegularPolygon {

	public static double isAreaOfRegularPolygon(int n, double s) {
		
		double area = (n * Math.pow(s, 2)) / (4 * (Math.tan((Math.PI)/n)));
		
		return area; 
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập vào số cạnh của hình đa giác: ");
		int n = input.nextInt();
		
		System.out.print("Nhập vào độ dài của các cạnh: ");
		double s = input.nextDouble();
		
		System.out.println("Diện tích hinh đa giác là: " + isAreaOfRegularPolygon(n, s));
		
		input.close();
	}
}
