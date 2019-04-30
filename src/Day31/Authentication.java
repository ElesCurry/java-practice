package Day31;

public class Authentication {
public static void main(String[] args) {
	login("mentoring@cybertekschool.com", "mentor001");
}

	
	/*
	 * Name: loGIN
	 * Return type: void
	 * 2 string args/params: username, password
	 * Inside method
	 * valid username = "mentoring@cybertekschool.com"
	 * validPassword = "mentor001"
	 * 
	 * if username and password match, print "Login successful! Welcome to OKTA"
	 * if not: "Sign in failed!"
	 * login("mylogin", "abc123")
	 */
	
	public static void login(String username, String password) {
		String validUsername = "mentoring@cybertekschool.com";
		String validPassword = "mentor001";
		
		
	if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword)); 
		System.out.println("Login successful! Welcome to OKTA");
	} else {
		System.out.println("Sign in failed!");
		
	}
}
}