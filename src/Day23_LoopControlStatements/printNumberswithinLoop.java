package Day23_LoopControlStatements;

public class printNumberswithinLoop {

	public static void main(String[] args) {
		//outer loop
		for(int j = 1; j <= 10; j++) {
			//inner loop
			for(int i = 1; i <= j; i++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
		//reverse
		for(int j = 10; j >= 1; j--) {
			//inner loop
			for(int i = j; i >= 1; i--) {
				System.out.print(i+" ");
				
			}
			System.out.println();

	}

	}
}
