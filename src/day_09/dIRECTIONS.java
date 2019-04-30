package day_09;
import java.util.Scanner;

public class dIRECTIONS {

	

	
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String start = scan.next();
	    String end = scan.next();
	    String result = end + " found";
	    if(start.equals("A")) {
	      if(end.equals("A")) {
	        System.out.println(result);
	      } else if(end.equals("B")) {
	        System.out.println("right: " + result);
	      }else if(end.equals("C")) {
	        System.out.println("right > down: " + result);
	      } else if(end.equals("D")) {
	        System.out.println("right > down > left: " + result);
	      }
	      }else if(start.equals("B")) {
	        if(end.equals("B")) {
	          System.out.println(result);
	        }else if(end.equals("C")) {
	          System.out.println("down: "+ result);
	        }else if(end.equals("D")) {
	          System.out.println("down > left: "+ result);
	        }else if(end.equals("A")) {
	          System.out.println("down > left > up: " + result);
	        }
	        }else if(start.equals("C")) {
	        if(end.equals("C")) {
	          System.out.println(result);
	        }else if(end.equals("D")) {
	          System.out.println("left: "+ result);
	        }else if(end.equals("A")) {
	          System.out.println("left > up: "+ result);
	        }else if(end.equals("B")) {
	          System.out.println("left > up > right: " + result);
	        }
	        
	        
	        }else if(start.equals("D")) {
	        if(end.equals("D")) {
	          System.out.println(result);
	        }else if(end.equals("A")) {
	          System.out.println("up: "+ result);
	        
	      }
	    }
	    
	  }
	}
