package Day31;

public class Calculator {

	public static void main(String[] args) {
		
		add(2.5,5);
		subtract(2000,300);
		multiply(5,5);
		divide(25,5);
		divide(105.4, 0);
		remainder(7,3);
		add(10, 20, 30);
		
		//using scanner pass 2 numbers and operator
	}
	private static void add(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}
	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("Result: " +result);
	}

	public static void subtract(double num1, double num2) {
		double result = num1 - num2;
		System.out.println("Result: "+result);
	}
	
	public static void multiply(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("cannot / by zero");
			return;
		}
			double result = num1 * num2;
		System.out.println("Result: "+result);
	}
	public static void divide(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("cannot / by zero");
			return; // exit the method here. do not run the rest
		}
		double result = num1 / num2;
		System.out.println("Result: " + result);
	}
	
	public static void remainder(double num1, double num2) {
		double result = num1 % num2;
		System.out.println("Result: " + result);
	}
	
}
		
	
	
	 
	

