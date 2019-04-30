package day20_loop;
import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
	int num = scan.nextInt();
	//check if it is valid. 1-10
	//if it is not valid return
	if(num < 1 || num > 10) {
		System.out.println("ERROR: Invalid input");
		return; //stop execution
		
	}
	//for loop to print multiplication table
	
	for(int i = 1; i <= 10; i++) {
		System.out.println(num +" x "+i+" = "+(num * i));
	}

}
}