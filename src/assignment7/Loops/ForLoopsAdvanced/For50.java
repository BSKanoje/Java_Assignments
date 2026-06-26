package assignment7.Loops.ForLoopsAdvanced;

//50. Simulate a dice roll until you roll a 6.

public class For50 {
	public static void main(String[] args) {
		int dice;
		
		do {
			System.out.print("Dice is rolled: ");
			dice = (int) (Math.random()*6) + 1;
			System.out.println(dice);
		} while(dice != 6);
		
		System.out.println("Yay, you rolled a 6");
	}
}
