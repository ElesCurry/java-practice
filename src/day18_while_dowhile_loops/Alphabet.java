package day18_while_dowhile_loops;

public class Alphabet {

	public static void main(String[] args) {
		char letter = 'a';
		while(letter <= 'z') {
			System.out.println(letter);
			letter++;
		}
		System.out.println();
		
		char capitals = 'A';
		while(capitals <= 'Z') {
			System.out.println(capitals+" ");
			capitals++;
		}

		//can you print lowercase in reverse
		
		char reverse = 'z';
		while(reverse >= 'a') {
			System.out.println(reverse + " ");
			reverse--;
		}
		
		//upper case A 
		//AB
		//ABC
		//ABCD......TILL THE END
		
		
		System.out.println();
		String letters = "";
		char myLetter = 'A';
		while(myLetter <= 'Z') {
			letters = letters + myLetter;
			System.out.println(letters);
			myLetter++;
		
		
		
		}	
		
				
	}

}
