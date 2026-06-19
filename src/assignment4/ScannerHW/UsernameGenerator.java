package assignment4.ScannerHW;

public class UsernameGenerator {

	public String getUsername(String fname, String lname, int yob) {
		
		String username = fname + lname + (yob % 100);
		return username;
	}
}
