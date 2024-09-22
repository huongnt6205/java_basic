package chapter6exercises;

import java.util.Scanner;

public class ChineseZodiac {

	public static void printZodiac(String[] zodiac, int year) {
		int index = year % 12;
		
		System.out.println("Zodiac sign for the year " + year + " is " + zodiac[index]);
	}
	
	public static void main(String[] args) {

		String[] zodiac = { "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake",
				"horse", "sheep" };

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		printZodiac(zodiac, year);
		
		input.close();
	}

}
