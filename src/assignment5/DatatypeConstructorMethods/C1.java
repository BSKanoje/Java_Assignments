package assignment5.DatatypeConstructorMethods;

// 1. Write a program to find simple interest using void method. Print those in method.

public class C1 {
	
	public void calculateSimpleInterest() {
		int PA = 10000;
		int R = 5;
		int T = 2;
		
		double SI = (PA * R * T)/100;
		System.out.println("Simple interest : "+SI);
	}
	
	public static void main(String[] args) {
		C1 c = new C1();
		c.calculateSimpleInterest();
	}

}
