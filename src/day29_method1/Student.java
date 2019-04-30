package day29_method1;

public class Student {

	public static void main(String[] args) {
		study();
		study();
		study();
		sayHello();
		code();

	}

	public static void study() {
		System.out.println("student is studying");
}
	
	//create a method with name sayHello,that prints,"Hello Friends!"
	
    

    public static void sayHello() {
	System.out.println("Hello Friends!");
	
}
    //create a method with name code.
    //"Inside code method"
    //Student is coding java
    
    public static void code() {
    	System.out.println("Inside code method");
    	System.out.println("Student is coding");
    }
}