package assignment3.TwoClassCommunication.Animals;

public class Animal {
	public static void main(String[] args) {
		
		Lion l = new Lion();
		System.out.println(l.name);
		System.out.println(l.type);
		System.out.println(l.voice);
		System.out.println(l.isA);
		
		System.out.println("------------");
		Horse h = new Horse();
		System.out.println(h.name);
		System.out.println(h.type);
		System.out.println(h.voice);
		System.out.println(h.isA);
	}
}
