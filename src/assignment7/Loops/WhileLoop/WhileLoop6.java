package assignment7.Loops.WhileLoop;

//6. Print all numbers divisible by 5 between 1 and 100.

public class WhileLoop6 {

	public static void main(String[] args) {
		int i = 5;
		
		while(i <= 100) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
