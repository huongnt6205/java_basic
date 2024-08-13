package chapter3andchapter4exercises;

public class ConvertPoundsToKilograms {

	public static void main(String[] args) {
		System.out.println("\tBẢNG QUY ĐỔI GIÁ TRỊ ");
		System.out.println("Kilograms \t Pounds \t | \t Pounds \t Kilograms");
		
		for(int kilograms = 1; kilograms <= 199; kilograms += 2) {
			
			double pounds = kilograms * 2.2;
			
			for(int pound = 20; pound <= 515; pound += 5) {
				double kilogram = pound * 0.453;
				
			System.out.printf("	%d \t %.1f \t | \t %d \t %.1f \n", kilograms, pounds, pound, kilogram);			
			}
		}
	}

}
