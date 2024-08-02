package chapter1;

import java.util.Scanner;

public class PopulationProjection {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập số dân hiện nay: "); //312,032,486
		int population = input.nextInt();
		
		int secondsPerDay = 60 * 60 * 24;
		
		int birthDays = secondsPerDay / 7;
		int deathDays = secondsPerDay / 13;
		int newImmigrant = secondsPerDay / 45;
		System.out.println("Số dân sinh ra trong 1 ngày là: " + birthDays);
		System.out.println("Số dân mất đi trong  1 ngày là " + deathDays);
		System.out.println("Số dân mới nhập cư trong 1 ngày là " + newImmigrant);
		
		int dayFor5Years = 365 * 5;
		int birth5Year = birthDays * dayFor5Years;
		int death5Years = deathDays * dayFor5Years;
		int newImmigrant5Years = newImmigrant * dayFor5Years;
		
		int totalPopulatinon = population + birth5Year - death5Years + newImmigrant5Years;
		System.out.println("Tổng số dân của US sau 5 năm là: " + totalPopulatinon);
		
		input.close();
	}

}
