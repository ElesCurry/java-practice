package day27_arrays05;

public class warmUpTask {

	public static void main(String[] args) {
		
		//Declare 2 int arrays time1 and time2
		//Both of them have 2 items/values that represent hours and minute
		//hours: 0 - 23
		// minutes 0 - 59
		
		//time1 = {11,40}
		//time2 = {15,25}
		//Print "Time is earlier"
		
		//time1 {11,40}
		//time2 = {11,25}
		int[] time1 = new int[2]; //0,0 by default
		int[] time2 = new int[2]; //0,0 by default
		int t;
		
		//System.out.println(time1[0]); //0
		
		
		time1[0] = 10;
		time1[1] = 15;
		
		time2[0] = 16;
		time2[1] = 10;
		
		//Before comparing, check if both arrays have valid hour/minute
		
		if(time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time1 has invalid hour");
			return;
			
		}
		if(time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time1 has invalid hour");
			return;
	}
		if(time2[0] < 0 || time2[0] > 23) {
			System.out.println("Time2 has invalid hour");
			return;
}
		if(time2[1] < 0 || time2[1] > 59) {
			System.out.println("Time2 has invalid hour");
			return;
		}
	//compare arrays and tell which one is earlier
		//compare hours
		if (time1[0] > time2[0]) {
			System.out.println("Time1 is earlier");
		}else if(time2[0] < time1[0]) {
			System.out.println("Time2 is earlier");
		}else {
			if(time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			}else if (time2[1] < time1[1]) {
				System.out.println("Time2 is earlier");
			}else {
				System.out.println("Same time!");
			}
			}
		}
		}
