package day15_string_manipulation;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String word1 = "github";
      System.out.println(word1.indexOf("g"));
      System.out.println(word1.indexOf("th"));
      System.out.println(word1.indexOf("hub"));
      System.out.println(word1.indexOf("java"));
      
      String url = "www.okta.com";
      int index = url.indexOf(".");
      System.out.println("Pos of . :" + index);
      System.out.println(url.charAt(index+1));
      
      String title = "Java - Google Search";
      //find position of '-' and check if space
      //is on right and left sides
      int dash = title.indexOf('-'); //5
      System.out.println(title.charAt(dash -1)); // " "
      System.out.println(title.charAt(dash + 2));
      
      
      
      String country = "United States of America";
      int states = country.indexOf("States");
      System.out.println("Position of states: " +states);
      
      String word2 = "java, c++, python, tomcat, eclipse";
      if (word2.contains("c++")) {
    	  System.out.println("c++ is there");
      }else {
    	  System.out.println("c++ is not there");
    	  
      }
      if (word2.indexOf("c++") > -1) {
    	  System.out.println("c++ is there");
      }else {
    	  System.out.println("c++ is not there");
      }
      
	}

}
