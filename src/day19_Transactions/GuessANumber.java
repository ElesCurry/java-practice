package day19_Transactions;
import java.util.*;


public class GuessANumber {

	public static void main(String[] args) {
		
      Scanner scan = new Scanner(System.in);
      System.out.println("### WELCOME TO GUESS A NUMBER GAME ###");
      //guess a number a game
      // secretNumber = 10;// 1-100
      //guessNumber = 5;
      //"Your number is too small"
//guessNumber = 50;
      //"Your number is too large"
      //guessNumber = 10;
      //"Bingo, Congratulations, you won!"
      
      int secretNumber = 83;
      int guessNumber;
      do {
    	  System.out.println("Guess a number:");
    	  guessNumber = scan.nextInt();
    	  if(guessNumber < secretNumber) {
    		  System.out.println("Your number is too small");
    	  }else if(guessNumber > secretNumber) {
    		  System.out.println("Your number is too large");
    	  }
      }while(guessNumber != guessNumber);
      System.out.println("Bingo, congratulations you won!");
      
      }
      
	}


