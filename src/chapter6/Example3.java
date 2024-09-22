package chapter6;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập số tháng(1 đến 12): ");
		int monthNumber = input.nextInt();

		String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "Sepmber",
				"October", "November", "December" };
		
		System.out.println("The month is " + month[monthNumber - 1] + "!");
		
		input.close();
	}
}
