package chapter2exercises;

import java.util.Scanner;

public class FindingRunwayLength {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập vận tốc của máy bay: ");
		double v = input.nextDouble();
		System.out.print("Nhập gia tốc của máy bay: ");
		double a = input.nextDouble();
		
		double lenght = (Math.pow(v, 2))/(2 * a);
		System.out.println("Chiều dài tối thiểu của đường băng là: " + lenght + "m");
		
		input.close();
	}
	
}
