package chapter6exercises;

import java.util.Arrays;
import java.util.Scanner;

public class AnalyzeScores {

//	public static double average(int count, int[] score) {
//
//		int sum = 0;
//
//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//
//		double averages = sum / count;
//		
//		return averages;
//	}
//
//	public static String score(int[] score) {
//
//		double average = average(, score)
//		int big = 0;
//		int small = 0;
//		for (int i = 0; i < score.length; i++) {
//			if (score[i] >= average(i, score[i]) {
//				big++;
//			} else if (score[i] < average(i, score)) {
//				small++;
//			}
//		}
//		System.out.println("Big: " + big + " and small " + small );
//		return big + " " +small;
//	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] scores = new int[100];
		int count = 0;
		int sum = 0;

		System.out.println("Enter number integer: ");

		int score;

		   while (count < 100) {
	            score = input.nextInt();
	            if (score < 0) {
	                break; 
	            }
	            scores[count] = score;
	            count++;
	            sum += score;
	            
	            
	        }
		   System.out.println(Arrays.toString(scores));


		double average = (double) sum / count;

		int big = 0;
		int small = 0;
		for (int i = 0; i < count; i++) {
			if (scores[i] >= average) {
				big++;
			} else {
				small++;
			}
		}
		System.out.println("Có " + big + " lớn hơn số TBC(" + average + ").");
		System.out.println("Có " + small + " bé hơn số TBC(" + average + ").");
		input.close();
	}
}
