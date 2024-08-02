package chapter2;

import java.util.Scanner;
public class DisplayTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap so nguyen cho giay: ");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60;
		System.out.println("so phut la: " + minutes);
		
		int remainingSeconds = seconds % 60;
		System.out.println("So giay con lai la: " + remainingSeconds);
		
		System.out.println( seconds + " seconds is " + minutes + " menutes and " + remainingSeconds + " seconds");
	
		input.close();
	}

}
