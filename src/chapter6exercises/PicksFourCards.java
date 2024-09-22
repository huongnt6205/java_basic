package chapter6exercises;

public class PicksFourCards {

	public static void randomCard(int[] card) {

		for (int i = 0; i < 4; i++) {
			card[(int) (Math.random() * 52)]++;
		}
	}

	public static int sum(int[] card) {
		int sum = 0;

		for (int i = 0; i < card.length; i++) {
			sum += ((i + 1) % 13) * card[i];
		}
		return sum;
	}

	public static void printCard(int[] card) {

		String[] ranks = { "Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		System.out.print("The number of picks that yields the sum of 24: ");
		for (int i = 0; i < card.length; i++) {
			if (card[i] > 0) {
				System.out.print(ranks[i % 13] + " ");
			}
		}
	}

	public static void main(String[] args) {

		int[] card;

		do {

			card = new int[52];

			randomCard(card);

		} while (sum(card) != 24);

		printCard(card);
	}
}
