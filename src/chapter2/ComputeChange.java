package chapter2;

import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập số tiền: ");
		Double amount = input.nextDouble();
		
		int amounts = (int) (amount * 100); 
		
		//chuyen so xu thanh dola và so xu còn lai la:
		int numberOfOneDollars = amounts / 100;
		amounts = amounts % 100;
		
		//Tim  quarters của số tiền còn lại 
		int numberOfQuarters = amounts / 25;
		amounts = amounts % 25;
		
		//Tim so Hào  trong so tien con lai
		int numberOfDimes = amounts / 10;
		amounts = amounts % 10;
		
		int numberOfNickels = amounts / 5;
		amounts = amounts % 5; 
		
		int numberOfPennies = amounts;
		
		System.out.println("Số tiền của bạn là : " + amount + " Bao gồm : \n"
				+ numberOfOneDollars + " Dollars \n"
				+ numberOfQuarters + " Quarters \n"
				+ numberOfDimes+ " Dimes \n"
				+ numberOfNickels +" Nickels \n"
				+ numberOfPennies + "Pennies");
		
		
		input.close();
	}

}
