package chapter3;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {	
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập vào một năm: ");
		int year = input.nextInt();
		
		//năm nhuận sẽ chia hết cho 4 ko chia hết cho 100 hoặc chia hết cho 400.
		boolean leapYear = (year % 4 == 0) && (year % 100 != 0 ) || (year % 400 == 0);
		System.out.println(year + " là năm nhuận đúng không? - " + leapYear);
		
		
		//cách khác: 
		if((year % 4 == 0) && (year % 100 != 0 ) || (year % 400 == 0)) {
			System.out.println(year + " là năm nhuận!");
		} else {
			System.out.println(year + " không phải là năm nhuận");
		}
		
		input.close();
	}
	
}

