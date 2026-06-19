package assignment4.methodReturnType;

public class Test4 {
	public static void main(String[] args) {
		
		PersonalDetailReturnType pd = new PersonalDetailReturnType();
		String name = pd.getName();
		System.out.println(name);
		
		int age = pd.calculateAge();
		System.out.println(age);
	}
}
