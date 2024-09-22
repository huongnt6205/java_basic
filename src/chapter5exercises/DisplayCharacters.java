package chapter5exercises;

public class DisplayCharacters {

	public static void printChars(char ch1, char ch2) {

		int count = 0;

		for (int i = ch1; i <= ch2; i++) {
			System.out.print((char) i + " ");
			count++;

			if (count % 10 == 0) {
				System.out.println();
			}

		}
	}

	public static void main(String[] args) {

		char ch1 = '1';
		char ch2 = 'Z';

		System.out.println("Các ký tự từ " + ch1 + " đến " + ch2 + " là: \n");

		printChars((char) ch1, (char) ch2);
	}
}
