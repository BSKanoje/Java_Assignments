package assignment7.Loops.ForLoopsAdvanced;

//47. Flip a virtual coin until you get "Heads" 3 times.

public class For47 {
	public static void main(String[] args) {
		
		int coin;
		int head = 0;
		
		while(head < 3) {
			System.out.print("Flip the coin: ");
			coin = (int) (Math.random()*2);
			if(coin == 1) {
				System.out.print("heads\n");
				head++;
			}
			else {
				System.out.print("tails\n");
			}
		}
		System.out.println("Got Heads 3 times");
		
		
	}
}
