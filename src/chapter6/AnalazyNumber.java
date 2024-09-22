package chapter6;

import java.util.Scanner;

public class AnalazyNumber {

	public static void main(String[] args) {
		
		final int NUMBER_OF_ELEMENT = 100;
		
		double[] number = new double[NUMBER_OF_ELEMENT];
		
		double sum =0;
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < NUMBER_OF_ELEMENT; i++) {
			System.out.print("Nhập số mới: ");
			number[i] = input.nextDouble();
			sum += number[i];
		}
		
		double average = sum/NUMBER_OF_ELEMENT;
		
		int count = 0;
		
		for(int i = 0; i < NUMBER_OF_ELEMENT; i++) {
			if(number[i] > average) {
				count++;
			}
		}
		System.out.println("trung bình cộng là: " + average);
		System.out.println("Số phần tử lớn hơn trung bình cộng là: " + count);
		
		
		input.close();
	}
}
