package chapter3andchapter4exercises;

import java.util.Scanner;

public class HighestScore {

    public static void main(String[] args) {
        final int NUMBER_STUDENTS = 5;
        Scanner input = new Scanner(System.in);
        
        String topStudent1 = "";
        String topStudent2 = "";
        double highestScore1 = -1;
        double highestScore2 = -1;
        
        for (int count = 0; count < NUMBER_STUDENTS; count++) {
            System.out.print("Nhập tên học sinh: ");
            String name = input.next();

            System.out.print("Nhập điểm của học sinh: ");
            double score = input.nextDouble();
            
            if (score > highestScore1) {
                highestScore2 = highestScore1;
                topStudent2 = topStudent1;
                
                highestScore1 = score;
                topStudent1 = name;
            }else {
            	
            	highestScore2 = score;
            	topStudent2 = name;
            }
        }
        
        System.out.println("\nHọc sinh có điểm cao nhất là: " + topStudent1);
        System.out.println("Điểm cao nhất là: " + highestScore1);
        
        System.out.println("\nHọc sinh có điểm cao thứ hai là: " + topStudent2);
        System.out.println("Điểm cao thứ 2 là: " + highestScore2);
        
        
        input.close();
    }
}
