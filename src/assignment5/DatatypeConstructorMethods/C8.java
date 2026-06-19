package assignment5.DatatypeConstructorMethods;

// 8. WAP such that input to a method will be integer and it will print its value in word, using return type method.
//#hint : input - 2 then output - Two

public class C8 {

	static public String numberToWord(int n) {
		switch(n) {
		case 0: return "Zero";
		case 1: return "One";
		case 2: return "Two";
		case 3: return "Three";
		case 4: return "Four";
		case 5: return "Five";
		case 6: return "Six";
		case 7: return "Seven";
		case 8: return "Eight";
		case 9: return "Nine";
		
		default: return "Invalid Number";
		}
	}
	
	
	public static void main(String[] args) {
		String result = numberToWord(0);
		System.out.println(result);
	}
}
