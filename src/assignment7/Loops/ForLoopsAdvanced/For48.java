package assignment7.Loops.ForLoopsAdvanced;

//48. Generate random numbers until the total sum exceeds 100.

public class For48 {
	public static void main(String[] args) {
		int n, sum = 0;
		
		do {
			n = (int) (Math.random()*100);
			System.out.println("Random number = " + n);
			sum += n;
			System.out.println("Sum = " + sum);

		} while(sum <= 100);
		System.out.println("Final sum = " + sum);
		}
}
