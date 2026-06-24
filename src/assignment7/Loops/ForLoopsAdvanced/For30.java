package assignment7.Loops.ForLoopsAdvanced;

//30. Keep generating random numbers until one is divisible by 7.

public class For30 {
	public static void main(String[] args) {
		int n;
		
		do {
			n = (int) (Math.random()*100+1);
			System.out.println(n);
		} while(n % 7 != 0);
		
		System.out.println("Number is divisible by 7: "+n);
	}
}
