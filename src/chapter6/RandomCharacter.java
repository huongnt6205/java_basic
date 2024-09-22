package chapter6;

import java.util.Random;

public class RandomCharacter {

	public static char getRandomLowerCaseLetter() {
		Random random = new Random();
		return (char) (random.nextInt(26) + 'a');
	}

	public static void main(String[] args) {

		char[] randomChar = new char[100];

		for (int i = 0; i < randomChar.length; i++) {
			randomChar[i] = getRandomLowerCaseLetter();
		}
		int count = 0;
		
		System.out.println("100 ký tự ngẫu nhiên là: ");
		for (int i = 0; i < randomChar.length; i++) {
			System.out.print(randomChar[i] + " ");
			count++;
			
			if(count % 10 == 0) {
				System.out.println();
			}
		}
	}
}
