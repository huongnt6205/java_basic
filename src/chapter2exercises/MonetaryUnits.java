package chapter2exercises;

import java.util.Scanner;

public class MonetaryUnits {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhập vào số tiền dưới dạng số nguyên: ");
		int amount = input.nextInt();
		
		int numberOfOneDollars = amount /100;
		amount = amount % 100;
		
		int numberOfQuarters = amount / 25;
		amount = amount % 25;
		
		int numberOfDimes = amount / 10;
		amount = amount % 10;
		
		int numberOfNickels = amount / 5;
		amount = amount % 5;
		
		int numberOfPennies = amount;
		
		System.out.println("Số tiền của bạn là : " + amount / 100.0 + " Bao gồm : \n"
				+ numberOfOneDollars + " Dollars \n"
				+ numberOfQuarters + " Quarters \n"
				+ numberOfDimes+ " Dimes \n"
				+ numberOfNickels +" Nickels \n"
				+ numberOfPennies + "Pennies");
		
		input.close();
	}

}
