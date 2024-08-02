package chapter2exercises;

import java.util.Scanner;

public class CalculatingEnergy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập khối lượng nước cần thiết để đun sôi(kg): ");
		double m = input.nextDouble();
		
		System.out.print("Nhập nhiệt độ ban đầu(độ C): ");
		double t0 = input.nextDouble();
		
		System.out.print("Nhập nhiệt độ cuối cùng của nước(độ C): ");
		double t1 = input.nextDouble();
		
		double Q = m * (t1 - t0) * 4184;
		System.out.println("Năng lương sinh ra trong quá trình đun sôi nước là: " + Q +"J");
		
		
		input.close();
	}
}
