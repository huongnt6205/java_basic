package chapter3andchapter4exercises;

import java.util.Scanner;

public class HighestScore2 {

	public static void main(String[] args) {
		final int NUMBER_STUDENTS = 5;
        Scanner input = new Scanner(System.in);
        
        String topStudent = "";
        double highestScore = -1;
        
        for (int count = 0; count < NUMBER_STUDENTS; count++) {
            System.out.print("Nhập tên học sinh: ");
            String name = input.next();

            System.out.print("Nhập điểm của học sinh: ");
            double score = input.nextDouble();
            
            if (score > highestScore) {
                highestScore = score;
                topStudent = name;
            }
        }
        
        System.out.println("\nHọc sinh có điểm cao nhất là: " + topStudent);
        System.out.println("Điểm cao nhất là: " + highestScore);
        
        input.close();

	}

}
