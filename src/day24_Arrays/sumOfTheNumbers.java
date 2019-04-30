package day24_Arrays;

import java.util.Arrays;

public class sumOfTheNumbers {

	public static void main(String[] args) {
		//lets create an array of integers with length 3
		
		int [] numbers = new int[3];
		//first value in array
		numbers[0] = 5;
		//second value in array
		numbers[1] = 10;
		//third value in array
		numbers[2] = 20;
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
		int sum = 0;
		//please use for loop, in order to loop through array
		//and calculate sum of all the elements
		//numbers.length --> returns number of elements in the array
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
			
		}
		
       System.out.println("Sum: "+sum);
       //find largest value in the array
       int max = Integer.MIN_VALUE;
       for(int i = 0; i < numbers.length;i++) {
    	   if(numbers[i] > max) {
    		   max = numbers[i];
    	   }
       }
       System.out.println("Max value: "+max);
       
       
       //Find min value in the array
       int min = Integer.MAX_VALUE;
       for(int k = 0; k < numbers.length;k++) {
    	   if(numbers[k]<min) {
    		   min = numbers[k];
    	   }
       }
       
       
       
       
       
       
       
       
       
       
       
	}

}
