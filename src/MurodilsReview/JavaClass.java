package MurodilsReview;

import java.util.Scanner;

public class JavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String word = "javaclass";
     //print middle char
     System.out.println("Middle one:" +word.charAt(word.length()/2));
     
     word = "javadays";
     
     String middle2 = word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2);
     System.out.println("Middle 2:"+middle2);
     
     
     String middleTwo = word.substring(word.length()/2-1,word.length()/2+1);
     System.out.println("MiddleTwo:" + middleTwo);
     
     
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter word, I will give you middle one(s)");
     String strInput = scan.next();
     String m = "";
     if(strInput.length()%2 == 0) {
    	 m = strInput.substring(strInput.length()/2-1,strInput.length()/2+1);
    	 
    	  }else {
    		  m = strInput.substring(strInput.length()/2,strInput.length()/2+1);
    	 
    	 System.out.println("M:"+m);
    	 
     }
     
  
	}

	private static int strInput() {
		// TODO Auto-generated method stub
		return 0;
	}

}
