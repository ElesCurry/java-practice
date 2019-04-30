package day15_string_manipulation;

public class Smiles {

	public static void main(String[] args) {
		String emoji = ":)";
		//==(equal) !=(not equal)
		if (emoji.length() !=2 ) {
			System.out.println("Invalid emoji");
			return; 
		}
		
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		if (first == ':') {
		}else if (first == ';') {
		}else if(first == '(') {
		}else if(first == ')') {
		}else {
			System.out.println("Invalid Emoji");
		}
		
			
		}
	}


