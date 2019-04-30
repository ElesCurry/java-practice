package Day30_methods02;


import java.util.Scanner;

public class MyNumbers {
	
	
	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 nums");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 < num2) {
			for(int i = num1; i<= num2; i++) {
				System.out.println(i +" ");
		}
		}else if(num1 > num2) {
			for(int k = num1; k>= num2; k--) {
				System.out.println(k+" ");
			}
	System.out.println();
	}
}
}
}