import java.util.Scanner;

public class Chapter_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int score = sc.nextInt();
		char grade;

		if (score >= 80) {
			grade = 'A';
		} else if (score >= 70) {
			grade = 'B';
		} else if (score >= 60) {
			grade = 'C';
		} else if (score >= 50) {
			grade = 'D';
		} else {
			grade = 'E';
		}
		System.out.println("Grade : " + grade);
		switch (grade) {
		case 'A':
			System.out.println("Excellent Score");
			break;
		case 'B':
			System.out.println("Very Good Score");
			break;
		case 'C':
			System.out.println("Good Score");
			break;
		case 'D':
			System.out.println("Average Score");
			break;
		case 'E':
			System.out.println("You have failed");
			break;
		default:
			System.out.println("Invalid Grade");
		}
	}
}
