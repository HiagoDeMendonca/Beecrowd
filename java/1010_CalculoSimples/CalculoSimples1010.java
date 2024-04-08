import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static DecimalFormat dfor = new DecimalFormat("0.00");
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float valorFinal = 0;
		
		for (int i = 0; i < 2; i++){
			
			String input = scan.nextLine();
			String[] pecas = input.split(" ");
			
			valorFinal += Integer.parseInt(pecas[1]) * Float.parseFloat(pecas[2]);
		}
		
		System.out.println("VALOR A PAGAR: R$ "+ dfor.format(valorFinal));
		
		scan.close();
		
	}
	
}
