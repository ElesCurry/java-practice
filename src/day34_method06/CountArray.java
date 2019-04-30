package day34_method06;

import java.util.Random;

public class CountArray {
	public static void main(String[] args) {
	int [] nums = {2,3,4,5,6,6,6,7,5,5,12};
	System.out.println(findOccurences(nums,5)); 
	System.out.println(findOccurences(nums,6)); 
	
	int five = findOccurences(nums,5);
	System.out.println("5 values: " +five);
	
	if(five > 0) {
		System.out.println("We have 5s");
	}else {
		System.out.println("No 5s");
	}
	if(findOccurences(nums, 2) > 0) {
	 System.out.println("We have 2");
	}else {
		System.out.println("No 2s");
	}
	
	int twenty = findOccurences(new int[] {10,20,20,30,55,22}, 20);
	System.out.println("twenty: " +twenty);
	
	}
	
	public static int findOccurences(int[] array, int value) {
		int counter = 0;
		for(int num : array) {
			if(num == value) {
				counter++;
				break;
			}
		}
		return counter;
		
	}
	
	public static int[] getArray() {
		int[] returnArray = {45, 43, 11, 545, 1000};
		return returnArray;
	}

	
	public static int[] getRandomArray(int size) {
		Random rand = new Random();//create random class object
		int[] nums = new int[size];//declare array with size number of elements
		for(int i = 0; i < size; i++) {
			nums[i] = rand.nextInt(101); //get random number and assign to array index
		}
		return nums;
		
	}
	
	
	
}
