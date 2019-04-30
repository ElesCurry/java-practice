(package day14_string_method;

public class StringSize {

	public static void main(String[] args) {
		String str1 = "Good Morning";
		//check if it matches "Good Morning" and print different match or not Match
		//Convert to All UPPER CASE and print
		if (str1.contentEquals("Good Morning")) {
		
			System.out.println("Match");
		}else {
			System.out.println("Not Match"); }
		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - ignore case");
		}else { 
			System.out.println("Not match - ignore case"); 
		}
			
			//Convert to all upper case and print
			System.out.println(str1.toUpperCase());
			
			System.out.println(str1); //it stays as old value
			
			str1 = str1.toUpperCase();
			System.out.println("After assignment: " +str1);
			
			//combine the above methods together;
			//convert to all lower case first then check if it equals("good morning")
			if(str1.toLowerCase().contentEquals("good morning")) {
				System.out.println("Chained methods: match");
			}else {
				System.out.println("Chained methods: do not match");
				
				
			}
					
			String myName = "Eles";
			System.out.println(myName.length());
			 int length = myName.length();
			 System.out.println("My name's lenght:" +length);
			 
			 
				 
			//usernames must be 8 characters.
			 //set some value and using if statement check it is
			 //8 characters: if true =>valid username, false => invalid username
			 //must be 8 chars
			 String userName = "password";
			 if(userName.length() ==8) {
				 System.out.println("Valid username");
			 }else  {
				 System.out.println("Invalid username, must be 8 char");
			 }
			 //password must be at least 6 characters
			 String password = "woodenSpoon";
			 if(password.length()>=6) {
				 System.out.println("Password is good");
			 }else {
				 System.out.println("Password is too short");
				 
			 }
			 int passwordLength = password.length();
			 if(passwordLength < 6) {
				 System.out.println("Invalid password, Too short");
			 }else {
				 System.out.println("Valid password, good job"); 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
			 }
					
		}
				

	}


