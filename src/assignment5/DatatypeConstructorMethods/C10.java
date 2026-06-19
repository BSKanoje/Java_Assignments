package assignment5.DatatypeConstructorMethods;

// 10. WAP such that a parameterized method will return random integer between 1 to 100 without giving any input.(once a method is called it
// should return any random int between 1 to 100). 

public class C10 {
	
	public int randomNumber() {

		int random = (int)(Math.random() * 100) + 1;
		return random;
	}
	
	public static void main(String[] args) {
		C10 c = new C10();
		System.out.println(c.randomNumber());
	}

}
