package Day23_LoopControlStatements;
import java.util.*;

public class WarmUPTask23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int number = scan.nextInt();
		for(int i = 2; i < number; i++ ) {
			if(number%i == 0) {
				System.out.println(number +"is not a prime number");
				return;
				
			}
		}
        System.out.println(number+"is prime");
	}

}
