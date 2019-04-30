package day19_Transactions;
import java.util.*;

public class Palindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to test:");
		String word = "SQL";
		String reversed = ""; 
				
				//loop through word in reverse order and
				//Concatenate each character to reversed string
				
				//compare if word and reversed are equal
				
				int idx = word.length()-1;
		while(idx > 0) {
			reversed = reversed + word.charAt(idx);
			idx--;
			
			
		}
		System.out.println(reversed);
		
				
		

	}

}
