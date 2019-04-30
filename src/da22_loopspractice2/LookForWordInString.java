package da22_loopspractice2;

public class LookForWordInString {

	public static void main (String[] args) {
		
		
		String sentence = "He said hi, then she replied hi. hi guys!";
		//print letter in pairs
		//he
		//e and space
		// space and s
		//ai
		//check if temp equals "hi",if true, add 1 to count
		int count = 0;
		for (int i = 0; i < sentence.length()-1; i++) {
		String temp = sentence.substring(i, i+2);
		
		System.out.println(temp);
		
	
	//count: 3
		if(temp.equals("hi")) {
			count++;
		}
		}
			System.out.println("count: "+count);
		
		
}
	
}