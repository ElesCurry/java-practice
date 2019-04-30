package da22_loopspractice2;

public class SubStringPractice {

	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.substring(0,2)); //ja
		//print each character in separate line using
		//substring, no loop
		System.out.println(word.substring(0, 1));
		System.out.println(word.substring(1, 2));
		System.out.println(word.substring(2, 3));
	    System.out.println(word.substring(3, 4));
	
	
	int i = 0;
	System.out.println(word.substring(i, i+1));
	i++;
	System.out.println(word.substring(i, i+1));
	i++;
	System.out.println(word.substring(i, i+1));
	i++;
	System.out.println(word.substring(i, i+1));
	i++;
	
	//using for loop and substring, print each char//java
	 System.out.println("##################");
	 for(int n = 0; n<= 3; n++) {
		 System.out.println(word.substring(n, n+1));
		 
	 }
	System.out.println("########REVERSE#######"); //REVERSE
	//print letter in reverse
	for(int n = 3; n >= 0; n-- ) {
		System.out.println(word.substring(n, n+1));
		
	}
    int start = 0;
    int end = 12;
    String word2 = "UnitedStates";
    System.out.println(word2.substring(start, end));
    System.out.println(word2.substring(2,3));
    System.out.println(word2.substring(6,7));
    
    //pass single input, start only and will include until last character
    System.out.println(word2.substring(6));
    //print last character
    String word3 = "apple";
    
    System.out.println(word3.substring( word3.length()-1));
    
    
    

}
}