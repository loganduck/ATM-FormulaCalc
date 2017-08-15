import java.util.Scanner;

public class FormulaCalculator {
	static Scanner scan = new Scanner(System.in);
	static double x, y, z;
	
	public static void main(String[] args) {
		System.out.print("result = (2x - 7.4) (4y + 9.3) (6z - 11.2) / xyz"
				+ "\n\tEnter x: ");
		x = scan.nextDouble();
		System.out.print("\tEnter y: ");
		y = scan.nextDouble();
		System.out.print("\tEnter z: ");
		z = scan.nextDouble();
		
		double result = ((2 * x - 7.4) * (4 * y + 9.3) * (6 * z - 11.2)) / (x*y*z);
		
		if (x == 0 || y == 0 || z == 0) {
			result = 0.0;
		}
		System.out.println("result = " + result);
	}
}
