package day21_loopsPractice;
import java.util.*;

public class Register {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("welcome, how many items are you purchasing today?");
		int itemsCount = keyboard.nextInt();
		double totalPrice = 0.0;
		String items = "";
		
		for(int count = 1; count <= itemsCount; count++) {
			System.out.println("What is item "+count+ "?");
			String itemName = keyboard.next();
			
			System.out.println("How much is " +itemName + "?");
			double itemPrice = keyboard.nextDouble();
			
			items += itemName + ", ";
			totalPrice += itemPrice;
			
			
		}
		
		System.out.println("Your items" +items);
        System.out.println("Your total price: $" +totalPrice);
	}

}
