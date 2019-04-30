package day24_Arrays;

public class ArrayofCharsPlusReverse {

	public static void main(String[] args) {
		char[] values = {'a', 'b', 'c'};
		for(char value: values) {
			System.out.println(value);
		}
		String str = "Wooden spoon";
		//this method to charArray() converts string to array of charachters
		char[] chars = str.toCharArray();
		for(char c: chars) {
			System.out.print(c+"_");

	}
    System.out.println();
	for(int i = chars.length-1; i >= 0; i--) {
		System.out.print(chars[i]);   //STR+CHARS[i]
	}                                 // System.out.println(str)
	
	
	//Print characters with help of array of characters, one by one
	//if characters is equals to 'o', replace with (print it instead of 'o')
	for(char c: chars) {
		if(c == 'o') {
			System.out.println("*");
		}else {
			System.out.println(c);
		}
	}
	System.out.println();
	char[] newChars = new char[3];
	System.out.println("Value of char: "+newChars[0]);
	System.out.println(String.valueOf(newChars[0]));
		
	}
	
}
