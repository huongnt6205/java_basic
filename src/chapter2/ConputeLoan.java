package chapter2;

import java.util.Scanner;

public class ConputeLoan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap lai suat hang nam: ");
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		System.out.println("Lai suat hang thang la: "  + monthlyInterestRate);
		
		System.out.print("Nhap so nam vay lai: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Nhap so tien can vay: ");
		Double loanAmount = input.nextDouble();
		
		Double monthPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		System.out.println("Thanh toan hang thang: " + monthPayment);
		
		double totalPayment = monthPayment * numberOfYears * 12;
		System.out.println("Tong so tienthanh toan: " + totalPayment);
		
		System.out.println(" \n Khoan can phai thanh toan hang thang la: $" + (int)(monthPayment * 100) / 100.0);
		System.out.println("Tong so tien can phai thanh toan la: $" + (int)(totalPayment * 100) / 100.0);
		input.close();
	}
}
