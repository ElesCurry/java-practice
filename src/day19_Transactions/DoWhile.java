package day19_Transactions;

public class DoWhile {

	public static void main(String[] args) {
		//print 1 to 10 using do while loop
		
		int i= 1;
		do {
			System.out.println(i);
			i++;
			
		}while (i <= 10);
		
		int sum = 0;
		int j = 1;
		do {
			sum = sum +j; //sum+=j;
		}while(j <= 5); //check the condition on the bottom	
		
		System.out.println("Sum from1 to 5 is "+sum);
		
		
		
		}
		
	}


