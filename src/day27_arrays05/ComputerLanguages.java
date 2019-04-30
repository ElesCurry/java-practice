package day27_arrays05;

public class ComputerLanguages {

	public static void main(String[] args) {
		// JAVA --> programming language
		// Selenium --> Test automation
		// TestNG --> Unit tests
		// JUnit --> Unit tests
		// Git --> Version control
		// Maven --> Building and execution
		
		 String[] tools = {"Java", "Selenium", "TestNG", "JUnit", "Cucumber"};
		 
		 for(String tool : tools) {
			   switch(tool.toLowerCase()) {
			   case "java":
				   System.out.println("Java --> programming language");
				   break;
			   case "selenium":
				   System.out.println("Selenium --> Test Automation");
				   break;
			   case "testng":
			   case "junit":
				   System.out.println(tool+" --> Testing tool");
				   break;
			   case "cucumber":
				   System.out.println("Cucumber --> BDD Style testing");
				   break;
			   case "git":
				   System.out.println("Git --> Version control");
				   break;
			   case "maven":
				   System.out.println("Maven --> Building and execution for project");
				   break;
			   default:
				   System.out.println("Unknown tool");
				   
			   }
		   }
		

		}
	}
		 
		 
		 
		 
		
		
