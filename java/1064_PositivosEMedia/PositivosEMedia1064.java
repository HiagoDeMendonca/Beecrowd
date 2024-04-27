import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.0");
	
	public static void main(String[] args) {
		
		int positivos = 0;
		float soma = 0;
		
		for (int i = 0; i < 6; i++) {
		float numero = scan.nextFloat();
			if (numero > 0) {
				positivos++;
				soma += numero;
			}
		}
		
		System.out.println(positivos + " valores positivos");
		System.out.println(dfor.format(soma / positivos));
		
		scan.close();
		
	}
}
