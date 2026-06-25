package assignment7.Loops.ForLoopsAdvanced;

//45. Create a triangle number pattern using for .

public class For45 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
