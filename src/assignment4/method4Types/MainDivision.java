package assignment4.method4Types;

public class MainDivision {
	public static void main(String[] args) {
		
		Division d = new Division();
		d.divisionVoid();
		
		System.out.println("-------------");
		int divr = d.divisionReturn();
		System.out.println("divisionReturn : "+divr);
		
		System.out.println("---------------");
		d.divisionVoidParam(78, 56);
		
		System.out.println("----------------");
		int divrp = d.divisionReturnParam(400, 844);
		System.out.println("divisionReturnParam : "+divrp);
	}
}
