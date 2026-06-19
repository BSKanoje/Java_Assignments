package assignment5.DatatypeConstructorMethods;

// 6. WAP with return type method which will have different methods with all 8 primitive return type

public class C6 {

	public byte m1() {
		byte a = 12;
		return a;
	}
	
	public short m2() {
		short a = 1234;
		return a;
	}
	
	public int m3() {
		int a = 773899;
		return a;
	}
	
	public long m4() {
		long a = 9921369050L;
		return a;
	}
	
	public float m5() {
		float a = 3.14f;
		return a;
	}
	
	public double m6() {
		double a = 345.999999999;
		return a;
	}
	
	public boolean m7() {
		boolean a = true;
		return a;
	}
	
	public char m8() {
		char a = 'A';
		return a;
	}
	
	public static void main(String[] args) {
		
		C6 c = new C6();
		System.out.println(c.m1());
		System.out.println(c.m2());
		System.out.println(c.m3());
		System.out.println(c.m4());
		System.out.println(c.m5());
		System.out.println(c.m6());
		System.out.println(c.m7());
		System.out.println(c.m8());
				
	}
}
