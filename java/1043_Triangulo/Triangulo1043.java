import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.0");
	
	public static void main(String[] args) {
		
		float A = scan.nextFloat();
		float B = scan.nextFloat();
		float C = scan.nextFloat();
		
		if (A < B + C && B < A + C && C < B + C) {
			System.out.println("Perimetro = " + dfor.format(A + B + C));
		}
		else {
			System.out.println("Area = " + dfor.format((A + B) / 2 * C));
		}
	}
}
