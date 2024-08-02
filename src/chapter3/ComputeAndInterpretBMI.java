package chapter3;

import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập cân nặng (pound): ");
		double weight = input.nextDouble();
		
		System.out.print("Nhập chiều cao (height): ");
		double height = input.nextDouble();
		
		double weightInKilograms = weight * 0.45359237;
		double heightInMeters = height * 0.0254;
		
		double bmi = weightInKilograms / (Math.pow(heightInMeters, 2));
		System.out.println("Chỉ số BMI là: " + bmi);
		
		if(bmi <= 18.5) {
			System.out.println("Thiếu cân!");
		}else if(bmi < 25){
			System.out.println("Bình thường!");
		}else if(bmi < 30) {
			System.out.println("Thừa cân!");
		}else {
			System.out.println("Béo phì!");
		}
		
		input.close();
	}

}
