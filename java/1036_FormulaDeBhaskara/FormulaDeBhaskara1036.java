import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.00000");
	
	public static void main(String[] args) {
		
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		
		double delta = B * B - 4 * A * C;
		
		if (delta > 0 && A != 0 && B != 0 & C != 0)
		{
			System.out.println("R1 = " + dfor.format((B * -1 + Math.sqrt(delta)) / (2 * A)));
			System.out.println("R2 = " + dfor.format((B * -1 - Math.sqrt(delta)) / (2 * A)));
		}
		else
		{
			System.out.println("Impossivel calcular");
		}
		
	}
	
}
