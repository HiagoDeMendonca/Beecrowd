import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		int[] arrayCedulas = {100, 50, 20, 10, 5, 2};
		int[] arrayMoedas = {100, 50, 25, 10, 5, 1};
		
		String input = scan.next();
		String[] arrayInput = input.split("\\.");
		int reais = Integer.parseInt(arrayInput[0]);
		int centavos = Integer.parseInt(arrayInput[1]);
		
		System.out.println("NOTAS:");
		
		for (int i = 0; i < 6; i++){
			
			System.out.println((reais / arrayCedulas[i]) + " nota(s) de R$ " + arrayCedulas[i] + ".00");
			reais %= arrayCedulas[i];
			
		}
		
		centavos += reais * 100;
		
		System.out.println("MOEDAS:");
		
		for (int i = 0; i < 6; i++){
			
			System.out.println((centavos / arrayMoedas[i]) + " moeda(s) de R$ " + dfor.format(arrayMoedas[i] / 100.0));
			centavos %= arrayMoedas[i];
			
		}
	}
}
