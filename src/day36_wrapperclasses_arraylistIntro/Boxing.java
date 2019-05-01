package day36_wrapperclasses_arraylistIntro;

public class Boxing {
	
	public static void main(String[] args) {
		//AUTOBOXING  ->PRIMITIVE ->OBJECT
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		
		
		//UNBOXING ->OBJECT ->PRIMITIVE
		Double d1 = new Double(34.2);
		double d2 = d1;
		System.out.println("d1: " +d1);
		System.out.println("d2: " +d2);
		
		long l1 = new Long(600000); //unboxing
		
		long l2 = new Long(34543543L); //no boxing
		long l3 = l2; //unboxing
		Long l4 = l3; //autoboxing
		
		Integer num3 = Integer.valueOf(345);
		//Double d3 = num3;
		
		
		
		
		
		
		
		
	}

}
