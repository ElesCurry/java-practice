package Day26_Arrays_Day3;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack {

	public static void main(String[] args) {
		
		
		  
		    Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }
		int dayCount = 0;
		
		
		System.out.println("Day "+(dayCount++)+" "+Arrays.toString(inhabitants1));
		do { 
			int sum = 0;
			for(int i =0; i < inhabitants));
					//storing information about where to divide by two in a boolean array.
					
		do {
			int sum =0;
			boolean[] check;
			for(int i=0; i < inhabitants1.length; i++) {
				if(inhabitants1[i]==0) {
					check[i] = true;
					check[i+2]==true;
				}
			}
			for (int j=1; j<check.length-1;j++) {
				if(check[j]) {
					inhabitants1[j-1]/=2;
				}
				sum1+=inhabitants1[j-1];
			}
			System.out.println("Day "+ (dayCount++)+" "+Arrays.toString(inhabitants));
		}

	}

	}}
