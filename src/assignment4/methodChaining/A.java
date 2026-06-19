package assignment4.methodChaining;

public class A {

	public void m1() {
		System.out.println("m1----A");
		B b = new B();
		b.m2();
		b.m1();
	}
	
	public void m2() {
		System.out.println("m2----A");
	}
}
