package Day31;

public class countUpWarmupTask {
	public static void main(String[] args) {
	countUp(5);
	countUp(0); }
	//1) name: countUp
	   //return type: void
	   //param: int
	   //it prints from 1 to the value of the param
	   //countUp(5);
	   //1 2 3 4 5
	public static void countUp(int num) {
		if(num < 1) {
			System.out.println("Invalid input");
		}else {
			
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i+ " ");
		}
		System.out.println();
/*
 

	   param value less than 1 then
	   print "invalid input"

	2) name countDown
	   return type: void
	   param: int
	   it prints from param value till 1
	   countDown(5);
	   5 4 3 2 1
       
       int j;
       String str;
       countDown(0);
       "Invalid input"
 */
		
		
	}

}
}
