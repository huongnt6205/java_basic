package chapter2;

import java.util.Scanner;
public class ComputeAverage {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap so thu nhat:");
		int number1 = input.nextInt();
		
		System.out.print("Nhap so thu hai: ");
		float number2 = input.nextFloat();
		
		System.out.print("Nhap so thu ba: ");
		double number3 = input.nextDouble();
		
		double average = number1 + number2 + number3;
		System.out.println("Tong ba so "+ number1 +", "+ number2 + " va " + number3 + " la: " +average);
		
		input.close();
	}

}
