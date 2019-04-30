package Day23_LoopControlStatements;

public class CheckNumber {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if(i%2>0) {    //if (i==15), break
				continue; //if you put break, it's gonna break before 15
				
				
			}
			System.out.println("Number "+i);
		}

	}

}
