package day_11_logical_operators_nestedif;
import java.util.*;

public class StringUsername {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username:");
		String username  = scan.next();
		System.out.println("Enter the password:");
		String password = scan.next();
		
		String validUsername = "cybertek@mail.com";
		String validPassword = "WoodenSpoon123";
		
		if(username.equalsIgnoreCase(validUsername) && password.contentEquals(validPassword)) {
			System.out.println("Login Successful, Welcome!");
		}else if (!username.equalsIgnoreCase(validUsername) && !password.contentEquals(validPassword)) {
			System.out.println("Invalid Username and Invalid Password");
			
		}else if (!username.equalsIgnoreCase(validUsername) && password.contentEquals(validPassword)) {
			System.out.println("Invalid Password");
			
		}
		

	}

}
