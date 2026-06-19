package assignment1.dataTypes;

// 29. WAP to calculate total of 3 subjects and print result.

public class DataType29 {
	public static void main(String[] args) {
		
		int math = 90;
		int eng = 67;
		int sci = 88;
		
		double sum = math + eng + sci;
		double percentage = (sum / 300) * 100;
		System.out.println(percentage);
	}
}
