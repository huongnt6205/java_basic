package chapter3andchapter4exercises;

public class DivisibleBy5And6 {

	public static void main(String[] args) {
		
		int count1 = 0;
		for(int number1 = 100; number1 <= 1000; number1++) {
			if(number1 % 5 == 0 && number1 % 6 == 0 ) {
				System.out.print(number1 + " ");
				count1++;
				
				if(count1 % 10 == 0) {
					System.out.println("");
				}
			}
		}
		
		int count2 = 0;
		for(int number2 = 100; number2 <= 1000; number2++) {
			if(number2 % 5 == 0 ^ number2 % 6 == 0 ) {
				System.out.print(number2 + " ");
				count2++;
				
				if(count2 % 10 == 0) {
					System.out.println("");
				}
			}
		}
	}

}
