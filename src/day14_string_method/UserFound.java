package day14_string_method;
import java.util.*;

public class UserFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    System.out.println("Enter full name:");
		    String user1 = scan.next();
		    String user2 = scan.next();
		    
		    if (user1.equalsIgnoreCase("max payne")) || (user1.equalsIgnoreCase("alan wake")) {
		    System.out.println("User found!");
		    }else {
		      System.out.println("User not found!"); 
		    
		    }
		  }
		}