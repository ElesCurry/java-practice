package day15_string_manipulation;

public class Contains {

	public static void main(String[] args) {
		String email = "test@gmail.com";
		System.out.println(email.contains("@") );
		String list = "potatoes, apples, tomatoes, eggs, milk, bread, cereal, meat";
		//check if apples are on the shopping list
		if (list.contains("apples")) {
		System.out.println("Apples are there");
			}else {
				System.out.println("Let's add apples in there");
		}
		boolean hasEggs = list.contains("eggs");
		System.out.println("Contains eggs: " +hasEggs);
		boolean hasCucumbers = list.contains("cucumbers");
		System.out.println("Contains cucumbers "+hasCucumbers);
		
		
		email = "name@yahoo.com";
		if (email.contains("@yahoo")) {
			System.out.println("Yahoo account");
		}else {
			System.out.println("GMAIL");
			}
		
	String name = "Alexander";
	if(name.contains("a") || name.contains("e")) {
		System.out.println("'a' or 'e' is missing");
	}
		

	}

}
