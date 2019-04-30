package day34_method06;

public class VarArgs {
	public static void main(String[] args) {
		printWords("red", "blue", "yellow");
		printWords("grey");
		printWords();
		String[] myPets = {"cat", "horse", "dog", "sheep", "goat"};
		printWords(myPets);z
		
		System.out.println(sum(3,5,10));
	}

	public static void printWords(String...words) {
		//handle it like an array
		for(String w : words) {
			System.out.println(w);
		}
	}
	
	public static int sum(int...nums) {
		int sum = 0;
		for(int n : nums) {
			sum +=n;
		}
		
		return sum;
		
	}
}
