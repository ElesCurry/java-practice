package Day23_LoopControlStatements;
import java.util.*;

public class SkipCurrentIteration {

	public static void main(String[] args) {
		//write a program that will concat 6 words with commas
		//if word is java skip
		Scanner scan = new Scanner(System.in);
		String concatWords = "";
		for(int i = 1; i <= 6; i++) {
			System.out.println("Type a word: ");
			String word = scan.next();
			if (word.contentEquals("java")) {
				continue;
			}
			concatWords+=word+",";
			}
		System.out.println(concatWords);
		}
		

	}


