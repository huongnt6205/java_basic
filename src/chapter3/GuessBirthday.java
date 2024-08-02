package chapter3;

import java.util.Scanner;

public class GuessBirthday {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String set1 = "1 3 5 7\n"
				+ "9 11 13 15\n"
				+ "17 19 21 23\n"
				+ "25 27 29 31";
		
		String set2 = "2 3 6 7\n"
				+ "10 11 14 15\n"
				+ "18 19 22 23\n"
				+ "26 27 30 31";
		
		String set3 = "4 5 6 7\n"
				+ "12 13 14 15\n"
				+ "20 21 22 23\n"
				+ "28 29 30 31";
		
		String set4 = "8 9 10 11\n"
				+ "12 13 14 15\n"
				+ "24 25 26 27\n"
				+ "28 29 30 31";
		
		String set5 = "16 17 18 19\n"
				+ "20 21 22 23\n"
				+ "24 25 26 27\n"
				+ "28 29 30 31";
		
		int day = 0;
		
		System.out.print("\nSinh nhật của bạn có phải vào set1 không? \n");
		System.out.print(set1);
		System.out.print("\nNhập 0 cho 'không' và nhập 1 cho 'có': ");
		
		int answer = input.nextInt();
		
		if(answer == 1) {
			day += 1;
		}
		
		System.out.print("\nSinh nhật của bạn có phải vào set2 không? \n");
		System.out.print(set2);
		System.out.print("\nNhập 0 cho 'không' và nhập 1 cho 'có': ");
		
		answer = input.nextInt();
		
		if(answer == 1) {
			day += 2;
		}

		System.out.print("\nSinh nhật của bạn có phải vào set3 không? \n");
		System.out.print(set3);
		System.out.print("\nNhập 0 cho 'không' và nhập 1 cho 'có': ");
		
		answer = input.nextInt();
		
			if(answer == 1) {
				day += 4;
			}

		System.out.print("\nSinh nhật của bạn có phải vào set4 không? \n");
		System.out.print(set4);
		System.out.print("\nNhập 0 cho 'không' và nhập 1 cho 'có': ");

		answer = input.nextInt();
	
		if(answer == 1) {				
			day += 8;
		}

		System.out.print("\nSinh nhật của bạn có phải vào set5 không? \n");
		System.out.print(set5);
		System.out.print("\nNhập 0 cho 'không' và nhập 1 cho 'có': ");
		answer = input.nextInt();
		
		if(answer == 1) {
			day += 16;
		}

		System.out.println("Ngày sinh nhật của bạn là: " + day + "!");
		
		input.close();
	}
	
	
}
