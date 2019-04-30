package day29_method1;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {
		//create 2D arrays 
		
		String [][] countriesArray ={ 
				{"USA" ,"Washington DC"},
				{"Canada", "Ottawa"},
				{"Mexico", "Mexico city"},
				{"Brasil", "Brasilia"},
				{"Peru", "Lima"},
				{"Argentina", "Buenas Aires"},
				{"Bolivia", "La Paz"},
				{"Macedonia", "Scopia"},
				{"Kazakhstan", "Nursultan"}
				};
		
		//String[][] c = new String[9][2]
	    //c[0][0] = "USA"; C[0][1] = "Washington DC";
		//print USA with Capital City
		System.out.println(countriesArray[0][0] + "|" +countriesArray[0][1]);
		System.out.println(countriesArray[8][0] + "|" +countriesArray[8][1]); //eight row column 1 for Nursultan
		System.out.println(Arrays.deepToString(countriesArray));
	
		//print all the countries in same line separated by |
		//for loop
		for(int i = 0; i < countriesArray.length; i++) {
		System.out.println(countriesArray[i][0] + "|");
		}
		//for each loop
		for(String[] country : countriesArray) {
			System.out.println(country[0]);
		
		
		}	
		//get all the Cities and add to cities[] array
		//declare cities array and size needs to match countries Array size
		//String[] cities = new String[9]
       String[] cities = new String[countriesArray.length];
       //null means no object, it is not the same as empty string
       System.out.println(Arrays.toString(cities));
       
       for(int i = 0; i < countriesArray.length; i++) {
    	   cities[i] = countriesArray[i][1];
       }
       System.out.println(Arrays.toString(cities));
       
       //look for Bolivia in the countries and test if capital city is "La Paz"
       
       for (int row = 0; row < countriesArray.length; row++) {
    	   if(countriesArray[row][0].equals("Bolivia")) {
    		   // System.out.println(countriesArray[row][1]);
    		   if(countriesArray[row][1].equals("La Paz")) {
    			   System.out.println("Bolivia test passed");
    		   }else {
    			   System.out.println("Bolivia test failed");
    		   }
    		   break;
    	   }
       }
	}

}
