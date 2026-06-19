package assignment5.DatatypeConstructorMethods;

// 9. WAP with parameterized method to compute the sum of digits in an integer.
// #hint : input - 25 then output - 7 (2+5), using operators it can be solved.
public class C9 {

	public int sumOfDigit(int n) {
		int sum = 0; 
		
		while(n!=0) {
			int lastDigit = n % 10;
			sum = sum + lastDigit;
			n = n / 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		C9 c = new C9();
		int sum = c.sumOfDigit(1234);
		System.out.println("Sum of digits: " +sum);
	}
}
