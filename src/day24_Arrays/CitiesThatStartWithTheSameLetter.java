package day24_Arrays;

public class CitiesThatStartWithTheSameLetter {

	public static void main(String[] args) {
		String [] cities = {"Washington D.C.", "Kiev", "Annandale", "Moscow", "Istanbul", 
				"Baku", "Miami", "Silver Spring", "Mclean"};
				System.out.println(cities.length);
				
		//Print all cities that start with M
     for(int i = 0; i < cities.length; i++) {
    	 if(cities[i].startsWith("M")) {
    		 System.out.println(cities[i]);
    	 }
     }
     for(String city: cities) {
    	 if(city.startsWith("M")) {
    		 System.out.println(city);
    	 }
     }
	}
}

