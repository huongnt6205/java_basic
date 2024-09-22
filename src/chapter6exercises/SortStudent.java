package chapter6exercises;

import java.util.Scanner;

public class SortStudent {

//	public static void sorted(String[] name, double[] score) {
//
//		for (int i = 0; i < score.length - 1; i++) {
//			if (score[i] < score[i + 1]) {
//				score[i] = score[i + 1];
//				name[i] = name[i + 1];
//			}
//		}
//	}

	public static void sorted(String[] name, double[] score) {

		for (int i = 0; i < score.length - 1; i++) {

			int index = i;

			for (int j = i; j < score.length; j++) {
				if (score[j] > score[index]) {
					index = j;
				}

			}
			String tempName = name[i];
			name[i] = name[index];
			name[index] = tempName;

			double tempScore = score[i];
			score[i] = score[index];
			score[index] = tempScore;
		}

	}

	public static void printArr(String[] name, double[] score) {
		
		sorted(name, score);
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("Student: " + name[i] + " - score: " + score[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number Student: ");
		int number = input.nextInt();

		String[] name = new String[number];
		double[] score = new double[number];

		for (int i = 0; i < number; i++) {
			System.out.print("Enter name student " + (i + 1) + ": ");
			name[i] = input.next();

			System.out.print("Enter score: ");
			score[i] = input.nextDouble();
		}

		System.out.println("Danh sach diem hoc sinh giam dan la: ");
		printArr(name, score);

		input.close();
	}
}
