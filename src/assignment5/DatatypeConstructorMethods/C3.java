package assignment5.DatatypeConstructorMethods;

// 3. WAP with parameterized method to calculate Area of following shapes
//	a. Square
//	b. Rectangle
//	c. Circle
//	d. Rhombus

public class C3 {

	public double getSquareArea(int side) {
		double area = side * side;
		return area;
	}
	
	public double getRectangleArea(int length, int breadth) {
		double area = length * breadth;
		return area;
	}
	
	public double getCircleArea(int radius) {
		double area = 3.14 * radius * radius;
		return area;
	}
	
	public double getRhombusArea(int diagonal1, int diagonal2) {
		double area = (diagonal1 * diagonal2) / 2;
		return area;
	}
	
	public static void main(String[] args) {
		
		C3 c = new C3();
		
		double sq = c.getSquareArea(4);
		System.out.println("Square area : "+sq);
		
		double rect = c.getRectangleArea(4, 6);
		System.out.println("Rectangle area : "+rect);
		
		double cir = c.getCircleArea(2);
		System.out.println("Circle area : "+cir);
		
		double rhom = c.getRhombusArea(7, 8);
		System.out.println("Rhombus area : "+rhom);

	}
}
