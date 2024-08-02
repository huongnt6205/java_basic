package chapter2exercises;

import java.util.Scanner;
public class ComputingBMI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập cân nặng (pound): ");
		double weightInPounds = input.nextDouble();
		System.out.print("Nhập chiều cao(inch): ");
		double heightInInches = input.nextDouble();
		
		double weights = weightInPounds * 0.45359237;
		System.out.println("Đổi " + weightInPounds + "pound = " + weights + "kg");//0.45359237		
		double heights = heightInInches * 0.0254;
		System.out.println("Đổi " + heightInInches + "inches = " + heights + "m");//0.0254
		
		double BMI = weights / (Math.pow(heights, 2));
		System.out.println("Chỉ số BMI là: " + BMI + "");
		
		input.close();
		
	}
}
