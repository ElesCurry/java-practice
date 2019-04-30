package day21_loopsPractice;

import java.util.Scanner;

public class Unique3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);

     System.out.println("Enter word");
     String word = scan.next();//javva
     String unique = "";
     
     for(int i = 0; i < word.length(); i++) {
    	 char letter = word.charAt(i);
    	 System.out.println(letter);
     }
     
     for (int i = 0; i < word.length(); i++) {
    	 System.out.println(i);
     }
     
	}

}
