package assignment2.typeCasting;

public class TypeCasting2 {
	public static void main(String[] args) {
		
		// short to byte
		short a = 120;
		byte b = (byte) a;
		System.out.println(b);
		
		// long to int
		long no = 9921395082L;
		int num = (int) no;
		System.out.println(num);
		
		// float to long
		float pi = 3.14f;
		long pii = (long) pi;
		System.out.println(pii);
		
		// double to float
		double d = 1234.78975757577777;
		float f = (float) d;
		System.out.println(f);
	}
}
