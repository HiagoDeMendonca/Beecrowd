import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static DecimalFormat dfor = new DecimalFormat("0.000000");

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		double valor1 = scan.nextDouble() + 100;
		double valor2 = scan.nextDouble() + 100;
		
		double resultado = ((valor1 * valor2) - 10000) / 100;
		
		System.out.println(dfor.format(resultado));
		
		scan.close();
		
	}
}
