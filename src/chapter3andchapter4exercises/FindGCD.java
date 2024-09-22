package chapter3andchapter4exercises;

import java.util.Scanner;

public class FindGCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập hai số nguyên number1 và number 2: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		int d;
		
		if(number1 < number2) {
			d = number1;
		}else {
			d = number2;
		}
		System.out.println("Giá trị nhỏ nhất  giữa 2 số là: "+ d);
		
		while(d > 0) {
			if(number1 % d == 0 && number2 % d == 0 ) {
				break;
			}
			d--;
		}
			System.out.println( d + " là ước chung lớn nhất của " + number1 + " và " +  number2);
			
		input.close();
	}

}
