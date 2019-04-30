package day19_Transactions;
import java.util.*;

public class Print_letter {

	public static void main(String[] args) {
		String word = "Amazon";
		int idx = 0;
		while(idx < word.length()) {
			System.out.print(word.charAt(idx));
		idx++;
		}
		//print each other in reverse order
		
		int idx2 = word.length() -1;
		while(idx2 >= 0) {
			System.out.println(word.charAt(idx2));
			idx2	--;
		
	}

}
	
}