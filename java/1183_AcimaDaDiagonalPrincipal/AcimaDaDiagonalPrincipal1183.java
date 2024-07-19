import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.0");

	public static void main(String[] args) {
		
		float[][] valores = new float[12][12];
		
		char operacao = scan.next().charAt(0);
		
		for (byte y = 0; y < 12; y++) {
			for (byte x = 0; x < 12; x++) {
				valores[x][y] = scan.nextFloat();
			}
		}
		
		double soma = 0;
		
		for (byte y = 0; y < 12; y++) {
			for (byte x = 11; x > y; x--) {		 //ordem invertida para evitar que o loop seja pulado
				soma += valores[x][y];
			}
		}
		
		if (operacao == 'M') {
			System.out.println(dfor.format(soma / 66));
		} else {
			System.out.println(dfor.format(soma));
		}
		
		scan.close();
		
	}
}
