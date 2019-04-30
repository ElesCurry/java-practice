package day24_Arrays;

public class SplitSentence {

	public static void main(String[] args) {
		String sentence = "Java is a general computer programming "
				          + "language that is concurrent, class-based, object-oriented,"
				          + "and specifically designed to have as "
				          + "few implementation dependencies as possible.";
		String[]words = sentence.split(" ");
		for(String str: words) {
			System.out.println(str);
		}
System.out.println(words[0]);

	}

}
