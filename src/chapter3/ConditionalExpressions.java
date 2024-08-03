package chapter3;

import java.util.Scanner;

public class ConditionalExpressions {

	public static void main(String[] args) {
		/**
		 * if (ages >= 16)
			ticketPrice = 20;
			else
			ticketPrice = 10;
		 */
		int age = 10;
		System.out.println((age >= 16) ? "ticketPrice = 20" : "ticketPrice = 10");
		
		/**
		 * if (count % 10 == 0)
			System.out.print(count + "\n");
			else
			System.out.print(count);
		 */
		int count = 200;
		System.out.println((count % 10 == 0) ? (count + "\ns") : count);
		
		
		Scanner input = new Scanner(System.in);
		//score = (x > 10) ? 3 * scale : 4 * scale
		System.out.print("Nhập x: ");
		int x = input.nextInt(); 
		
		System.out.print("Nhập tỷ lệ: ");
		double scale = input.nextDouble();
		
		if(x > 10) {
			double score = 3 * scale;
			System.out.println(score);
		} else {
			double score = 4 * scale;
			System.out.println(score);
		}
		
		//tax = (income > 10000) ? income * 0.2 : income * 0.17 + 1000;
		System.out.print("Nhập thu nhập: ");
		double income = input.nextDouble();
		double tax;
		if(income > 10000) {
			tax = income * 0.2;
		} else {
			tax = income * 0.17 + 1000;
		}
		System.out.println(tax);
		
		//System.out.println((number % 3 == 0) ? i : j);
		System.out.print("Nhập number, i, j: ");
		int number = input.nextInt();
		int i = input.nextInt();
		int j = input.nextInt();
		
		if (number % 3 == 0) {
			System.out.println(i);
		} else {
			System.out.println(j);
		}
		
		input.close();
	}

}
