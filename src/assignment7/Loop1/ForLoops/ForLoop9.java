package assignment7.Loop1.ForLoops;

// 9. Write a program to print all odd numbers between 1 to 100 using if condition.

public class ForLoop9 {

	public static void main(String[] args) {

		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) 
				System.out.print(i + " ");
		}
	}

}
