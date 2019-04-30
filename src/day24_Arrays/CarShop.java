package day24_Arrays;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		// BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
		// 1. Step: Create an array of strings, and store these cars inside that array
		
		
		String[] cars = {"BMW", "AUDI", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
		
		
		//2.Step: Print car names that starts with M
		for(String c: cars) {
			if(c.startsWith("M")) {
				continue;
				
			}
			System.out.println(c);
		}
		
		System.out.println("********************");
		
		//3.Step: Print all cars that have letter "r" somewhere in the name
		
		for (String make : cars) {
			if(make.toLowerCase().contains("r")) {
				System.out.println(make);
			}
		}
		
System.out.println("******************");
for(int i = 0; i < cars.length;i++) {
	String car = cars[i];
	if(car.length() >=6) {
		System.out.println(car);
		
		
	}
}
//Swap first and last value in the array
//FIRST VALUE: cars[i], last value: cars[cars.length-1
System.out.println("******************");
String temp = cars[0];
cars[0] = cars[cars.length-1];
cars[cars.length-1] = temp;
System.out.println(Arrays.toString(cars));


	}

}