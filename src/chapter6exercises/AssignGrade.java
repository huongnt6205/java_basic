package chapter6exercises;

import java.util.Arrays;
import java.util.Scanner;

public class AssignGrade {

	public static int isTheBestScore(int[] scoreArr) {
		int bestScore = scoreArr[0];

		for (int i = 1; i < scoreArr.length; i++) {
			if (bestScore < scoreArr[i]) {
				bestScore = scoreArr[i];
			}
		}
//		System.out.println(bestScore);
		return bestScore;
	}

	public static String[] isScore(int[] scoreArr) {

		double bestScore = isTheBestScore(scoreArr);
//		System.out.println(bestScore);

		String[] gradeScore = new String[scoreArr.length];

		for (int i = 0; i < scoreArr.length; i++) {
			if (scoreArr[i] >= (bestScore - 10)) {
				gradeScore[i] = "A";
			} else if (scoreArr[i] >= (bestScore - 20)) {
				gradeScore[i] = "B";
			} else if (scoreArr[i] >= (bestScore - 30)) {
				gradeScore[i] = "C";
			} else if (scoreArr[i] >= (bestScore - 40)) {
				gradeScore[i] = "D";
			} else {
				gradeScore[i] = "F";
			}
		}
		return gradeScore;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of student: ");
		int student = input.nextInt();

		int[] scoreArr = new int[student];

		System.out.print("Enter " + student + " score: ");
		for (int i = 0; i < student; i++) {
			scoreArr[i] = input.nextInt();
		}

		System.out.println(Arrays.toString(scoreArr));
		String[] grade = isScore(scoreArr);
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.println("Student" + i + " score is " + scoreArr[i] + " and grade is " + grade[i]);
		}

		input.close();
	}
}