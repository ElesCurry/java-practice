package day33_methods05;

public class PayCalculator {
	
	public static void main(String[] args) {
		int pay = getHourlyPay(40, 50);
		System.out.println("Total pay for 40 hours: "+pay);
		System.out.println(getHourlyPay(0, 10));
	}

	public static int getHourlyPay(int hours, int rate) {
		int totalPay = hours * rate;
		return totalPay;
	} 
}
