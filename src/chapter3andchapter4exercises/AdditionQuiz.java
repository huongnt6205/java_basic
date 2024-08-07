package chapter3andchapter4exercises;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        int correctCount = 0;
        long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < 10; i++) {
            int number1 = (int) (Math.random() * 15) + 1;
            int number2 = (int) (Math.random() * 15) + 1;

            System.out.print("Câu hỏi " + (i + 1) + ": " + number1 + " + " + number2 + " = ");
            int answer = input.nextInt();

            if (number1 + number2 == answer) {
                System.out.println("Đúng!");
                correctCount++;
            } else {
                System.out.println("Sai. Câu trả lời đúng là " + (number1 + number2));
            }
        }

        long endTime = System.currentTimeMillis();
        long testTime = (endTime - startTime) / 1000;

        System.out.println("Số câu trả lời đúng là: " + correctCount);
        System.out.println("Thời gian làm bài kiểm tra là: " + testTime + " giây");

        input.close();
    }
}
