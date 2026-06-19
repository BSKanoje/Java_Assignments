package assignment2.typeCasting;

// WAP to convert temperature from Fahrenheit to Celsius degrees
public class TypeCasting3 {
	public static void main(String[] args) {
		
		double F = 98.6;
		
		double C = (F - 32) * 5 / 9;
		
		System.out.println("Temperature in Celsius : "+C);
	}
}
