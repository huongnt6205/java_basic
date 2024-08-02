package chapter2exercises;

import java.util.Scanner;
public class FeetIntoMeters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//feet -> meters
		System.out.print("Nhập giá trị của feet: ");
		double feet = input.nextDouble();
				
		double meters = feet * 0.305;
		System.out.println("Đổi: " + feet + "feet = " + meters + "m" );
		
		//pounds -> kilograms
		System.out.print("\nNhập giá trị của founds: ");
		double founds = input.nextDouble();
		
		double kilograms = founds * 0.454;
		System.out.println("Đổi: " + founds + "founds = " + kilograms + "kg");
		input.close();
	}
}
