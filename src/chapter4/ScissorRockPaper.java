package chapter4;

import java.util.Scanner;
import java.util.Random;

public class ScissorRockPaper {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Random randomChoice = new Random();

		System.out.print("Nhập tên người chơi: ");
		String userName = input.next();

		String resultUserChoice = null;

		int countUser = 0;
		int countBoss = 0;
		while (countUser < 2 && countBoss < 2) {
			System.out.print("Người chơi hãy chọn 0-kéo 1-búa 2-bao: ");
			int userChoice = input.nextInt();
			
			switch (userChoice) {
			case 0: {
				resultUserChoice = "Kéo";
				break;
			}
			case 1: {
				resultUserChoice = "Búa";
				break;
			}
			case 2: {
				resultUserChoice = "Bao";
				break;
			}
			default: {
				System.out.println("Xin vui lòng nhập lại!");
			}
			}

			String resultbossChoice = null;
			int bossChoice = randomChoice.nextInt(3);

			switch (bossChoice) {
			case 0: {
				resultbossChoice = "Kéo";
				break;
			}
			case 1: {
				resultbossChoice = "Búa";
				break;
			}
			case 2: {
				resultbossChoice = "Bao";
				break;
			}
			}

			System.out.println("Kết quả mà " + userName + " đã chọn là: " + resultUserChoice);
			System.out.println("Kết quả mà máy chọn là: " + resultbossChoice);

			if (resultUserChoice.equals(resultbossChoice)) {
				System.out.println("Hòa!");

			} else if ((resultUserChoice.equals("Kéo") && resultbossChoice.equals("Bao"))
					|| (resultUserChoice.equals("Búa") && resultbossChoice.equals("Kéo"))
					|| (resultUserChoice.equals("Bao") && resultbossChoice.equals("Búa"))) {
				System.out.println("Bạn đã thắng");
				countUser++;
			} else {
				System.out.println("Bạn đã thua!");
				countBoss++;
			}

			if (countBoss == 2) {
				System.out.println("Trò chơi kết thúc! Bạn đã thua!");
			} else if (countUser == 2) {
				System.out.println("Trò chơi kết thúc! Bạn đã thắng!");
			}

		}
		input.close();
	}

}
