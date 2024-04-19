import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		int[] salarios = {400, 800, 1200, 2000, Integer.MAX_VALUE};
		int[] porcentagens = {15, 12, 10, 7, 4};
		
		float input = scan.nextFloat();
		
		int percentual = 0;
		
		for (byte i = 0; percentual == 0; i++) {
			if (input <= salarios[i]) {
				percentual = porcentagens[i];
			}
		}
		
		float reajuste = input / 100 * percentual;
		
		System.out.println("Novo salario: " + dfor.format(input + reajuste));
		System.out.println("Reajuste ganho: " + dfor.format(reajuste));
		System.out.println("Em percentual: " + percentual + " %");
		
		scan.close();
		
	}
}
