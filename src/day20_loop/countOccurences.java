package day20_loop;

public class countOccurences {

	public static void main(String[] args) {
		//word
		//char to count the number of occurrences
		String word = "abcabqabc";
		char myChar = 'a';
		int counter = 0;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == myChar) {
				counter++;
				
			}
		}
System.out.println("Count: " + counter);

	}

}
