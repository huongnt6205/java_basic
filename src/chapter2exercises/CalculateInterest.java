package chapter2exercises;

import java.util.Scanner;

public class CalculateInterest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập số dư tài khoản: ");
		double balance = input.nextDouble();
		System.out.print("Nhập lãi suất phần trăm hàng năm: ");
		double annualInterestRate  = input.nextDouble();
		
		double interest = balance * (annualInterestRate /1200);
		System.out.println("Lãi suất tháng sau là: " + interest);
		
		input.close();
	}
}
