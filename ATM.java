import java.util.Scanner;

/**
 * Enter a value in whole dollars and then displays
 * the combinations of twenties, tens, fives, and ones.
 * The input value shall not exceed 500 dollars. 
 * 
 * @author LoganDuck
 */
public class ATM {
	static int twenties, tens, fives, ones; 
	static String output;
	static int amount;
	static Scanner scan = new Scanner(System.in);
		
	public static void main(String[] args) {
		System.out.print("Enter the amount: $");
		amount = scan.nextInt();
		while (!(amount <= 500)) {
			System.out.print("Limit of $500 exceeded! Enter a new value: ");
			amount = scan.nextInt();
		}
		System.out.println("Bills by denomination: " 
				+ "\n\t$20: " + getTwenties()
				+ "\n\t$10: " + getTens()
				+ "\n\t$5: " + getFives()
				+ "\n\t$1: " + getOnes()
				+ "\n\n\t$399 = (" + twenties + " * $20)"
				+ " + (" + tens + " * $10)"
				+ " + (" + fives + " * $5)"
				+ " + (" + ones + " * $1)");
	}

	static int currentNum;
	public static int getTwenties() {
		currentNum = amount/20;
		amount = amount - currentNum*20;
		twenties = currentNum;
		return currentNum;
	}
	
	public static int getTens() {
		currentNum = amount/10;
		amount = amount - currentNum*10;
		tens = currentNum;
		return currentNum;
	}
	
	public static int getFives() {
		currentNum = amount/5;
		amount = amount - currentNum*5;
		fives = currentNum;
		return currentNum;
	}
	
	public static int getOnes() {
		currentNum = amount;
		amount = amount - currentNum;
		ones = currentNum;
		return currentNum;
	}
}