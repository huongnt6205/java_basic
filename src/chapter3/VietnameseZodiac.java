package chapter3;

import java.util.Scanner;

public class VietnameseZodiac {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Nhập năm sinh để đoán cung hoàng đạo: ");
		int year = input.nextInt();

		switch (year % 12) {
		case 0: {
			System.out.println("Bạn tuổi Khỉ ");
			break;
		}
		case 1: {
			System.out.println("Bạn tuổi Gà ");
			break;
		}
		case 2: {
			System.out.println("Bạn tuổi Chó ");
			break;
		}
		case 3: {
			System.out.println("Bạn tuổi Lợn ");
			break;
		}
		case 4: {
			System.out.println("Bạn tuổi Chuột ");
			break;
		}
		case 5: {
			System.out.println("Bạn tuổi Trâu ");
			break;
		}
		case 6: {
			System.out.println("Bạn tuổi Hổ ");
			break;
		}
		case 7: {
			System.out.println("Bạn tuổi Mèo ");
			break;
		}
		case 8: {
			System.out.println("Bạn tuổi Rồng ");
			break;
		}
		case 9: {
			System.out.println("Bạn tuổi Rắn");
			break;
		}
		case 10: {
			System.out.println("Bạn tuổi Ngựa");
			break;
		}
		case 11: {
			System.out.println("Bạn tuổi Dê");
		}
		default:
			System.out.println("Không xác định!");
		}

		input.close();
	}
}
