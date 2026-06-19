package assignment5.DatatypeConstructorMethods;

import java.time.Year;

// 13. WAP to get current age of person providing only Date of birth as an input in parameterized method. Void method can be used here.

public class C13 {
	
	public void getAge(int yob) {
		int currentYear = Year.now().getValue() ;
		int age = currentYear - yob;
		System.out.println("You are "+age+" years old..");
	}
	
	public static void main(String[] args) {
		C13 c = new C13();
		c.getAge(1977);
	}
}
