package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//25. Keep taking marks input until the user enters -1, then calculate average.

public class For25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks, sum = 0, count = 0;
		double avg;
		
		do {
			System.out.print("Enter marks(-1 to stop): ");
			marks = sc.nextInt();
			if(marks != -1) {
				sum += marks;
				count++;
			}
		} while(marks != -1);
		
		avg = (double) sum / count;
		System.out.println("Average : "+avg);
		sc.close();
	}
}
