package assignment5.DatatypeConstructorMethods;

// 4. WAP to find curved surface area of following, using void method
//	a. Sphere
//	b. Cylinder
//	c. Cube
//	d. cuboid

public class C4 {
	
	public double sphere(int radius) {
		double area = 4 * 3.14 * radius * radius;
		return area;
	}
	
	public double cylinder(int radius, int height) {
		double area = 2 * 3.14 * radius * height;
		return area;
	}
	
	public double cube(int side) {
		double area = 4 * side * side;
		return area;
	}
	
	public double cuboid(int length, int breadth, int height) {
		double area = 2 * height * ( length + breadth );
		return area;
	}
	
	public static void main(String[] args) {
		
		C4 c = new C4();
		
		double sphere = c.sphere(1);
		System.out.println("Sphere area : "+sphere);
		
		double cylin = c.cylinder(7, 8);
		System.out.println("Cylinder surface area : "+cylin);
		
		double cube = c.cube(7);
		System.out.println("Cube surface area : "+cube);
		
		double cuboid = c.cuboid(7, 5, 70);
		System.out.println("Cuboid area : "+cuboid);
	}

}
