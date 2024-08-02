package chapter3;

import java.util.Scanner;

public class SimpleIfDemo {
	public static void main(String[] args) {
		
		/*************************/
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập một số nguyên: ");
		
		int number = input.nextInt();
		if(number % 5 == 0) {
			System.out.println("HiFive!");
		} 
		if(number % 2 == 0){
			System.out.println("HiEven!");
		}
		
		/*****************/
		System.out.println("Nhập giá trị của y: ");
		int y = input.nextInt();
		int x = 0;
		if(y > 0) {
			x = 1;
			System.out.println(x);
		}
		
		/*********************/
		System.out.println("Nhập số tự nhiên bất kỳ: ");
		int numbers = input.nextInt();
		
		if(numbers <= 30 ) {
			System.out.println("Nhỏ hơn hoặc bằng 30!");
		} else {
			System.out.println("lớn hơn 30!");
		}

		input.close();
		
	}

}
