package chapter5;

import java.util.Scanner;

public class RandomCharacter {

	public static char getRandomCharacter(char ch1, char ch2) {

		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));

	}

	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}

	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}

	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Lấy 1 ký tự ngẫu nhiên: " + getRandomCharacter('A', 'z'));

		System.out.println("Lấy 1 ký tự thường ngẫu nhiên: " + getRandomLowerCaseLetter());

		System.out.println("Lấy một ký tự in hoa ngẫu nhiên: " + getRandomUpperCaseLetter());

		System.out.println("Lấy 1 ký tự chữ số ngẫu nhiên: " + getRandomDigitCharacter());

		System.out.println("Lấy một ký tự Unicode ngẫu nhiên: " + getRandomCharacter());
		input.close();
	}
}
