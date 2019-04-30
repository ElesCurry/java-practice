package day15_string_manipulation;

public class indexOf2 {

	public static void main(String[] args) {
		//index of with 2 inputs
		String list = "html-selenium-angular-jenkins-grid";
		int firstDash = list.indexOf("-");
		System.out.println("First dash: " + firstDash);
		
		int secondDash = list.indexOf("-", 5);
		System.out.println("second dash: "+secondDash);
		
		int thirdDash = list.indexOf("-", secondDash+1);
		System.out.println("third dash: " +thirdDash);
		
		//find the last dash
		int lastDash = list.indexOf("-");
		System.out.println("last dash: " +lastDash);

	}

}
