package chapter2exercises;

import java.util.Scanner;

public class PopulationProjection {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhập số năm: ");
		int years = input.nextInt();
		
		int population = 312032486;
		System.out.println("Số dân ban đầu là: " + population);
		
		int secondsPerYears = 60 * 60 * 24 * 365;
		
		int birth5Years = secondsPerYears / 7 * years;
		System.out.println("Số dân được sinh trong 5 năm là: " + birth5Years);
		int death5Years = secondsPerYears / 13 * years;
		System.out.println("Số dân tử trong 5 năm là: " + death5Years);
		int newImmigrant5Years = secondsPerYears / 45 * years;
		System.out.println("Số dân nhập cư trong 5 năm là: " + newImmigrant5Years);
		
		int totalPopulation = population + birth5Years - death5Years + newImmigrant5Years;
		System.out.println("Tổng số dân sau 5 năm là: " + totalPopulation);
		
		input.close();
	}
	
}
