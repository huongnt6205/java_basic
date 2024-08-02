package chapter2exercises;

import java.util.Scanner;

public class Fahrenheit {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhập nhiệt độ dưới dạng độ C: ");
		double celsius = input.nextDouble();
		
		double fahrenheit = (9.0 / 5) * celsius + 32;
		System.out.println("Nhiệt độ hiện tại khi chuyển từ độ C sang độ F là: " + fahrenheit);
		
		input.close();
	}
}
