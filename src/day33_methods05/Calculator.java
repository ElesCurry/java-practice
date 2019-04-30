package day33_methods05;

public class Calculator {
	public static void main(String[] args) {
	addVoid(2,5);
	add(3,4);
	}
	
	
	public static void addVoid(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum: " + sum);
	}

	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static void main1(String[] args) {
		int result = add(4,8);
		System.out.println("Result: " +result);
	}

	
	public static double multiply(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}


	public static double divide(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}


	public static double minus(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}


	public static double minus(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
