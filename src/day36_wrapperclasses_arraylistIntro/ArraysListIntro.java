package day36_wrapperclasses_arraylistIntro;
import java.util.*;

public class ArraysListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = new String[5];
		ArrayList<String> names = new ArrayList<>();
		
		int[] numsArray = new int[5];
		ArrayList<Integer> nums = new ArrayList<>();
		
		//assign values into arraylist
		names.add("Roman");
		names.add("Olimjon");
		
		nums.add(100);
		nums.add(99);
		System.out.println(names.get(0));

	}

}
