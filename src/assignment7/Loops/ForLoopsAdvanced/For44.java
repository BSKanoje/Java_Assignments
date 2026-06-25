package assignment7.Loops.ForLoopsAdvanced;

//44. Create a star pattern of fixed rows using a for loop.

public class For44 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
