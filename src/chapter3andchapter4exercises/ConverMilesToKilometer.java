package chapter3andchapter4exercises;

public class ConverMilesToKilometer {

	public static void main(String[] args) {
		
		System.out.println("\tBẢNG QUY ĐỔI GIÁ TRỊ ");
		System.out.println("	Miles \t Kilometers ");
		
		for(int miles = 1; miles <= 10; miles++) {
			double kilometers = miles * 1.609;
			
			System.out.printf("	%d \t %.3f \n", miles, kilometers);
		}
	}

}
