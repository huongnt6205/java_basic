package chapter3;

import java.util.Scanner;

public class TestBooleanAge {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/***3.25**********/
		System.out.print("Nhập đọ tuổi của bạn: ");
		int age = input.nextInt();
		
		boolean result = (13 <= age)  && (age <= 18);
		
		if(result == true) {
			System.out.println(result + " Đây là Độ tuổi của tôi!");
		}else{
			System.out.println(result + " Đây không phải đáp án đề đưa ra!");
		}
		
		/***3.26 3.27 3.28***********/
		System.out.print("\nNhập khối lượng(pound) và Chiều cao(inch): ");
		double weight = input.nextDouble();
		double height = input.nextDouble();
		
		boolean result1 = (weight > 50) || (height > 60);
		System.out.println("kết quả của (weight > 50) || (height > 60) là: " + result1);
		boolean result2 = (weight > 50) && (height > 60);
		System.out.println("ket qua của (weight > 50) && (height > 60) là: " + result2);
		boolean result3 = (weight > 50) ^ (height > 60);
		System.out.println("kết quả của (weight > 50) ^ (height > 60) là: " + result3 + ", but not both!");
		
		
		input.close();
	}
}
