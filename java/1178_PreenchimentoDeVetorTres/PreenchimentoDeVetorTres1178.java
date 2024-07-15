import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.0000");

	public static void main(String[] args) {
		
		double input = scan.nextDouble();
		
		for (short i = 0; i < 100; i++) {
			System.out.println("N[" + i + "] = " + dfor.format(input));
			input /= 2;
		}
		
		scan.close();
		
	}
}
