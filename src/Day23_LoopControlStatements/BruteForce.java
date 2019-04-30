package Day23_LoopControlStatements;

import java.util.Scanner;

public class BruteForce {

	public static void main(String[] args) {
		String expectedUserName = "admin";
		String expectedPassword = "admin123";
		String username = "";
		String password = "";
		int attempts = 5;
		Scanner scan = new Scanner(System.in);
		do {
			if(attempts-- == 0) {
				System.out.println("You have exceeded number of attempts");
				System.out.println("This user has been deactivated for 30 minutes");
				return;
			}
			System.out.println("Please enter user name");
			username = scan.next();
			if(!username.contentEquals(expectedUserName)) {
				System.out.println("Wrong user name");
				System.out.println("Attempts left: " +attempts);
				continue;
			}
			System.out.println("Please enter password");
			password = scan.next();
			if(password.equals(expectedPassword)) {
				System.out.println("Wrong password");
				System.out.println("Attempts left: " +attempts);
				continue;
				
			}
		}while(!username.contentEquals(expectedUserName) || !password.contentEquals(expectedPassword));
		System.out.println("Login sucessfull");
		

	}

}
