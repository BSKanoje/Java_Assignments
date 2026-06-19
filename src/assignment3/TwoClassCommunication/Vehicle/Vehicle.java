package assignment3.TwoClassCommunication.Vehicle;

public class Vehicle {
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.type);
		System.out.println(c.speed);
		
		System.out.println("---------------");
		Truck t = new Truck();
		System.out.println(t.type);
		System.out.println(t.speed);
		
		System.out.println("----------------");
		Bike b = new Bike();
		System.out.println(b.type);
		System.out.println(b.speed);
	}

}
