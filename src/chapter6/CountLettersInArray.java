package chapter6;

public class CountLettersInArray {

	public static char[] creatArray() {
		char[] chars = new char[100];

		for (int i = 0; i < chars.length; i++) {
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		}
		return chars;
	}

	public static void displayChars(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			if ((i + 1) % 20 == 0) {
				System.out.print(chars[i]);
				System.out.println();
			} else {
				System.out.print(chars[i] + " ");
			}
		}
	}

	public static int[] countLetters(char[] chars) {
		int[] count = new int[26];

		for (int i = 0; i < chars.length; i++) {
			count[chars[i] - 'a']++;
		}
		return count;
	}

	public static void displayCounts(int[] count) {
		for (int i = 0; i < count.length; i++) {
			if ((i + 1) % 10 == 0) {
				System.out.print(count[i] + " " + (char) (i + 'a'));
				System.out.println();
			} else {
				System.out.print(count[i] + " " + (char) (i + 'a') + " ");
			}
		}
	}

	public static void main(String[] args) {

		char[] chars = creatArray();

		System.out.println("Các ký tự in thường là: ");
		displayChars(chars);

		System.out.println("-------------------------------------");

		int[] count = countLetters(chars);
		System.out.println("Số lần xuất hiện của mỗi chữ cái là: ");
		displayCounts(count);
	}
}
