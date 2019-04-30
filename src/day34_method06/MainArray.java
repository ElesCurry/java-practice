package day34_method06;

import java.util.Arrays;

public class MainArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(CountArray.getArray()));
		
		int[] nums = CountArray.getArray();
		System.out.println(Arrays.toString(nums));
		
		for(;;) {
			System.out.println(Arrays.toString(CountArray.getRandomArray(20)));
			
			
		}

	}

}
