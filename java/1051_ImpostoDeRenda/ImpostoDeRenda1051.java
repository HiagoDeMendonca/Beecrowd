import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		float input = scan.nextFloat();
		float imposto = 0;
		float[] taxa = {0.08f, 0.18f, 0.28f};
		int[] espaco = {1000, 1500, Integer.MAX_VALUE};
		
		if (input <= 2000) {
			System.out.println("Isento");
		}
		
		else {
			input -= 2000;
			for (int i = 0; input > 0; i++) {
				imposto += Math.min(espaco[i], input) * taxa[i];
				input -= Math.min(espaco[i], input);
			}
			
			System.out.println("R$ " + dfor.format(imposto));
		}
		
		scan.close();
		
	}
}
