package assignment5.DatatypeConstructorMethods;

// 12. WAP to find the percentage of 5 integers.

public class C12 {

	public double percentage(int n1, int n2, int n3, int n4, int n5) {
		int sum = n1 + n2 + n3 + n4 + n5;
		double percent = (sum / 500.0) * 100 ;
		return percent;
	}
	
	public static void main(String[] args) {
		C12 c = new C12();
		double per = c.percentage(78,99,45,85,100);
		System.out.println(per);
	}
}
