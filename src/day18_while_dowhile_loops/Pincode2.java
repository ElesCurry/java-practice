package day18_while_dowhile_loops;
import java.util.*;

public class Pincode2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int secretPincode = 4321;
		
		//give only three attempts
		//if attempt reaches more than , print card blocked
		
		int pincode = 0;
		int attempts = 1;
		
		while(pincode != secretPincode && attempts <= 3) {
			System.out.println("enter pincode");
			pincode = scan.nextInt();
			attempts++;
			
			if(attempts == 3 && pincode != secretPincode) {
				System.out.println("card is blocked");
				return;
			}
		}
		System.out.println("access granted. Select operation");

	}

}
