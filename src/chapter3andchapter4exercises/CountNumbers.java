package chapter3andchapter4exercises;

import java.util.Scanner;

public class CountNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;
        int total = 0;
        int count = 0;

        System.out.print("Nhập một số nguyên, input kết thúc nếu nó = 0: ");
        
        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > 0) {
                countPositive++;
            } else {
                countNegative++;
            }

            total += number;
            count++;
        }

        if (count == 0) {
            System.out.println("Không có số nào được nhập ngoại trừ 0!");
        } else {
            double average = (double) total / count;
            System.out.println("Số lượng số dương là: " + countPositive);
            System.out.println("Số lượng số âm là " + countNegative);
            System.out.println("Tổng là " + total);
            System.out.printf("Trung bình là %.2f \n", average);
        }

        scanner.close();
    }
}

