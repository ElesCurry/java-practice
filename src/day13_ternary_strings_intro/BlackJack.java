package day13_ternary_strings_intro;
import java.util.*;
public class BlackJack {

	public static void main(String[] args) {
		
		
		  
		    Scanner scan = new Scanner(System.in);
		    
		    
		    int house = scan.nextInt();
		    int player = scan.nextInt();
		    
		    int total = scan.nextInt();
		    if(total > 21){
		      System.out.println("bust");
		    }else if(house > player){
		      System.out.println("player loss");
		    }else if(player == house){
		      System.out.println("its a tie");
		    }else if(player > house){
		      System.out.println("player wins");
		    }
		     }
		
		    
		  

		    
		  


	}


