package chapter5exercises;

public class GameCraps {

	public static void printCraps(int n1, int n2) {

		int count = 0;
		for (int i = 1; i <= 10000; i++) {

			n1 = (int) (Math.random() * 6) + 1;
			n2 = (int) (Math.random() * 6) + 1;

			int total = n1 + n2;

			if (total == 2 || total == 3 || total == 12) {
				System.out.println("Bạn đã lăn xúc xắc được " + n1 + " + " + n2 + " = " + total);
				System.out.println("You Lose!");
			} else if (total == 7 || total == 11) {
				System.out.println("Bạn đã lăn xúc xắc được " + n1 + " + " + n2 + " = " + total);
				System.out.println("You Win!");
				count++;
			} else {
				int point = total;

				System.out.println("Bạn đã lăn xúc xắc được " + n1 + " + " + n2 + " = " + total);

				while (true) {
					n1 = (int) (Math.random() * 6) + 1;
					n2 = (int) (Math.random() * 6) + 1;

					total = n1 + n2;

					System.out.println("Bạn đã lăn xúc xắc được " + n1 + " + " + n2 + " = " + total);

					if (total == 7) {
						System.out.println("You Lose!");
						break;
					} else if (total == point) {
						System.out.println("You Win!");
						count++;
						break;
					}
				}
			}
		}
		System.out.println("Số lần thắng là: " + count);
	}

	public static void main(String[] args) {

		int n1 = (int) (Math.random() * 6) + 1;
		int n2 = (int) (Math.random() * 6) + 1;

		printCraps(n1, n2);

	}
}
