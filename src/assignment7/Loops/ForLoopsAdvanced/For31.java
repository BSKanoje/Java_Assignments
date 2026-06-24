package assignment7.Loops.ForLoopsAdvanced;

//31. Find the first number greater than 100 that is divisible by both 4 and 6.

public class For31 {
	public static void main(String[] args) {
		int i = 100;
		
		do {
			i++;
		} while(!(i % 4 == 0 && i % 6 == 0));
		System.out.println(i);
	}
}
