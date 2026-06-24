package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//24. Repeat a menu until the user chooses “Exit”.

public class For24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("----------------------------");
			System.out.println("-----------Menu-------------");
			System.out.println("----------------------------");
			System.out.println("1. Add");
			System.out.println("2. Substract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Exit");
			System.out.println("----------------------------");
			System.out.print("Please enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.err.println("You selected Add");
				break;
			case 2:
				System.err.println("You selected Subtract");
				break;
			case 3:
				System.err.println("You selected Multiply");
				break;
			case 4:
				System.err.println("You selected Divide");
				break;
			case 5:
				System.err.println("Exiting...");
				break;
			default:
				System.err.println("Invalid choice");
			}

		} while (choice != 5);
		System.out.println("YOU are exited..");
		sc.close();
	}
}
