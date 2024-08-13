package chapter3andchapter4exercises;

public class ConvertKilogramsToPounds {

	public static void main(String[] args) {
		System.out.println("\tBẢNG QUY ĐỔI GIÁ TRỊ ");
		System.out.println("	Kilograms \t Pounds");
		
		for(int kilograms = 1; kilograms <= 199; kilograms+=2) {
			
			double pounds = kilograms * 2.2;
			
			System.out.printf("	%d \t \t %.1f", kilograms, pounds);
			System.out.println("");
		}
	} 

}
