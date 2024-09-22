package chapter5exercises;

public class NumberDayInYears {

	public static int NumberOfDayInYears(int year) {
		int numberDays;
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			numberDays = 366;
		} else {
			numberDays = 365;
		}
		
		return numberDays;
	}
	
	public static void main(String[] args) {
		int year;
		System.out.println("Years \t Number Day");
		System.out.println("-------------------");
		for(year = 2000; year <= 2020; year++) {
			
			System.out.printf("%d \t %d \n", year, NumberOfDayInYears(year));
		}
	}
	
}
