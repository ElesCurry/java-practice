package day20_loop;

public class PrintEachChar {

	public static void main(String[] args) {
		String word = "Wooden Spoon";
		
		// using for loop, print each char one by one
		for(int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i));
		}

		//using for loop, print only vowel (a,e,0,i,u)
		for(int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
		
			if(letter == 'a' || letter =='e' || letter == 'o' || 
					letter == 'i' || letter == 'u' ) {
				System.out.print(letter + ", ");
				
		}
	}

		System.out.println();
		//using for loop, print each other char one by one
		for(int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if ( ! (letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u')) {
				System.out.println(letter + " ,");
			}
			
		}
	}
}