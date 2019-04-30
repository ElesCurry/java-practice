package day18_while_dowhile_loops;

public class Counter {

	public static void main(String[] args) throws InterruptedException {
		//1,2,3,4,5,6....10
		int num = 1;
		while(num <= 10) {
	System.out.print(num+ ", ");
	num++;
	Thread.sleep(1000);
		}
		System.out.println("\nNum value after loop:" +num);
		// \n puts a line in the next line
		
		
		//11,10,9,8,7.......////printing the numbers backwards
		int num2 = 11;
		while(num2 >= 1) {
			System.out.println(num2 + ", ");
			num2--;
			Thread.sleep(456);
		}
		
		
		System.out.println("Num2: "+num2);

	}
}


