package day25_arrayContinue;

public class Shopping {

	public static void main(String[] args) {
		String[] products = {"Timberland Shoes", "H&M Shirt", "Swatch Watch Watch", "Gucci Bag", "Adidas socks"};
		double[] prices = {120.0, 5.99, 150.0, 3000.5, 6.99};
		int[] itemsId = {12345, 12346, 12347,12348,12349};
		
		//Print count of products
		System.out.println("Products count: "+products.length);
		//check if products prices in ItemIds have same count
		if(products.length == prices.length && products.length == itemsId.length) {
			System.out.println("shopping list looks good");
		}else {
			System.out.println("Something is wrong in this list");
			return;
		}
		
		
		//loop through products and print each one in separate line
		
		
		for(String product : products ) { 
			System.out.println(product);
		}
		//prices --> for loop
		for(int i = 0; i<prices.length; i++) {
			System.out.println(prices[i]);
		}
		
		//itemId --> print this in reverse using loop
		System.out.println(itemsId[ itemsId.length - 1 ]);
		for(int idx = itemsId.length - 1; idx >= 0; idx--) {
			System.out.println(itemsId[idx]);
		}
		//print a report with a total price
		//Item 1: 12345 - Timberland Shoes - $120.0
		//......
		//Total Price:
		System.out.println("########YOUR SHOPPING RECEIPT######");
		double totalPrice = 0.0;
		for(int i = 0; i < products.length; i++) {
			System.out.println("Item "+(i+1) +": "+ itemsId[i] + " - " +products[i] +" - $"+prices[i]);
			totalPrice +=prices[i];
			
			
			
		}
		System.out.println("Total Price: $" +totalPrice);
		
		//Find the most expensive item in your list and print it as a report
		
		//Loop and find. Do not use Array class
		
		int maxIndex = 0;
		double maxPrice = 0;
		for(int j = 0; j < prices.length; j++) {
			if(prices[j] > maxPrice) {
				maxPrice = prices[j];
				maxIndex = j;
				
			}
		}
		System.out.println(itemsId[maxIndex]+" - "+products[maxIndex]+ " - $" +maxPrice);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
