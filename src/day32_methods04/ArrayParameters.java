package day32_methods04;

import java.util.Arrays;

public class ArrayParameters {
	public static void main(String[] args) {
		int[] myArray = {44,22,66,11};
		printArray(myArray);
		printArray(new int[] {33, 45, 5, 7});
		
		int[] one = {10, 2, 3};
		int[] two = {3,1};
		print2Arrays(one, two);
	}
	
	/*
	 * Method: printArray
	 * return type: void
	 * param: int[] nums
	 * print values of the nums array
	 */

	
	public static void printArray(int[] nums) {
		for(int n : nums) {
			System.out.println(n + " ");
		}
		System.out.println();
	}
	
	
	/*
	 * Method name: print2Arrays
	 * return: void
	 * params: 2 int[] arrays
	 * it prints the larger array followed by smaller array
	 */
	
	public static void print2Arrays(int[] arrNums1, int[] arrNums2) {
		if(arrNums1.length > arrNums2.length) {
			System.out.println(Arrays.toString(arrNums1));
			System.out.println(Arrays.toString(arrNums2));
		}else {
			System.out.println(Arrays.toString(arrNums2));
			System.out.println(Arrays.toString(arrNums1));
		}
		
		
	}
}
