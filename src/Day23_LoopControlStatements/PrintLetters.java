package Day23_LoopControlStatements;

public class PrintLetters {

	public static void main(String[] args) {
		//outer loop will repeat printing of letters as many times as you want
		//in this case we are gonna a print three times
		//so we are repeating in a loop three times
		for(int i = 0; i < 3; i++) {
		//write a for loop, that will print letter from, a to z
		for(char letter = 'a'; letter <= 'z'; letter++) {
			System.out.print(letter);
			
			
		}
		System.out.println();
		System.out.println("**************************");

	}

	}
}
