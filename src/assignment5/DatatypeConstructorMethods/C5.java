package assignment5.DatatypeConstructorMethods;

// WAP to find the square, cube of a single number. Input should be given through constructor.

public class C5 {
	
	int n;

	public C5(int n) {
		this.n = n;
	}

	public int square() {
		int sq = n * n;
		return sq;
	}
	
	public int cube() {
		int c = n * n * n;
		return c;
	}
	
	public static void main(String[] args) {
		
		C5 c = new C5(5);
		System.out.println("Square : "+c.square());
		System.out.println("Cube : "+c.cube());
	}
}
