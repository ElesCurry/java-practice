package day36_wrapperclasses_arraylistIntro;
import java.util.*;

public class ArraysListExample {

	public static void main(String[] args) {
		//declare arrayList called languages
		ArrayList<String> languages = new ArrayList<>();
		//add values
		languages.add("Java");
		languages.add("English");
		languages.add("Kyrgyz");
		
		System.out.println("Number of values: "+languages.size());
		languages.add("Turkish");
		System.out.println("Number of values: "+languages.size());
		
		
		//remove java
		languages.remove(0);
		System.out.println("Number of values: "+languages.size());

	}

}
