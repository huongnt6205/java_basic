package project1;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		Random randomChoice = new Random();

		System.out.print("Nhập tên người chơi: ");
		String userName = inputScanner.next();

		String resultUserChoice = null;
		System.out.print("Người chơi hãy chọn 0-kéo 1-búa 2-bao: ");
		int userChoice = inputScanner.nextInt();

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

//		if (resultbossChoice != resultbossChoice) {
//			if ((resultUserChoice.equals("Kéo") && resultbossChoice.equals("Bao"))
//					|| (resultUserChoice.equals("Búa") && resultbossChoice.equals("Kéo"))
//					|| (resultUserChoice.equals("Bao") && resultbossChoice.equals("Búa"))) {
//				System.out.println("Bạn đã thắng");
//			}
//			if ((resultUserChoice.equals("Kéo") && resultbossChoice.equals("Búa"))
//					|| (resultUserChoice.equals("Búa") && resultbossChoice.equals("Bao"))
//					|| (resultUserChoice.equals("Bao") && resultbossChoice.equals("Kéo"))) {
//				System.out.println("Bạn đã thua!");
//			}
//		} else {
//			System.out.println("Hòa");
//		}

		if (resultUserChoice.equals(resultbossChoice)) {
			System.out.println("Hòa!");
		} else if ((resultUserChoice.equals("Kéo") && resultbossChoice.equals("Bao"))
				|| (resultUserChoice.equals("Búa") && resultbossChoice.equals("Kéo"))
				|| (resultUserChoice.equals("Bao") && resultbossChoice.equals("Búa"))) {
			System.out.println("Bạn đã thắng");
		} else {
			System.out.println("Bạn đã thua!");
		}
		inputScanner.close();
	}

}
