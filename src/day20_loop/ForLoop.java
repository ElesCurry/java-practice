package day20_loop;

public class ForLoop {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 1; i <= 10;i++) {
			System.out.println("Love Java");
		}
		//For loop print 5 to 10
		for(int i = 5; i <= 15; i++) {
			System.out.println(i);
		}
		
		//For Loop print 20 to 5
		for(int n = 20;  n >= 5; n--) {
			System.out.print(n +" ");
			Thread.sleep(456);
		}

	}

}
