package assignment5.DatatypeConstructorMethods;

// 2. WAP to get simple interest using parameterized methods. print statement should be in main class.
//	a. Add a new method to find Rate of Interest
//	b. Principal amount
//	c. Period

public class C2 {

	public int getPrincipalAmount(int principal) {
		return principal;
	}
	
	public int getRateOfInterest(int roi) {
		return roi;
	}
	
	public int getPeriod(int year) {
		return year;
	}
	
	public double simpleInterest(int P, int R, int T) {
		double SI = (P * R * T) / 100;
		return SI;
	}
	
	public static void main(String[] args) {
		
		C2 c = new C2();
		int p = c.getPrincipalAmount(10000);
		int r = c.getRateOfInterest(5);
		int t = c.getPeriod(2);
		
		double si = c.simpleInterest(p, r, t);
		System.out.println("Principal Amount : "+p);
		System.out.println("Rate of Interest : "+r);
		System.out.println("Period(In years) : "+t);
		System.out.println("Simple Interest : "+si);
		
	}
}
