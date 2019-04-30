package day20_loop;

public class EvenOrOdd {

	public static void main(String[] args) {
		//using for loop: 1-100
		//1.print all even numbers in same line
		//2. print all odd numbers in same line
		//3. sumOfOdds, sumOfEvens - calculate them
		//and print out after the loop
	
		
		for(int n = 1; n <= 100; n++) {
			if(n % 2 == 0) {                 // == means IS
				System.out.print(n+ " ");
				//2. print all odd numbers in same line
						
			}
			
		}
        System.out.println();
		for(int j = 1; j <= 100; j++) {
			if(j % 2 != 0) {
				System.out.print(j+" ");     //!= is not
			}
			
		}
	    //3. sumOfOdds, sumOfEvens - calculate them
		//and print out after the loop
		int sumOfOdds = 0;
		int sumOfEvens = 0;
		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				sumOfEvens += num;
			}else { 
				sumOfOdds += num;
				
				
			}
		}
		System.out.println("Sum of evens: "+sumOfEvens);
		System.out.println("Sum of odds: "+sumOfOdds);
	}

}
