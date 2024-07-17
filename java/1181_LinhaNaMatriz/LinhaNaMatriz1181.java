import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.0");

	public static void main(String[] args) {
		
		float[][] valores = new float[12][12];
		
		byte linha = scan.nextByte();
		char operacao = scan.next().charAt(0);
		
		for (byte y = 0; y < 12; y++) {
			for (byte x = 0; x < 12; x++) {
				valores[x][y] = scan.nextFloat();
			}
		}
		
		double soma = 0;
		
		for (byte x = 0; x < 12; x++) {
			soma += valores[x][linha];
		}
		
		if (operacao == 'M') {
			System.out.println(dfor.format(soma / 12));
		} else {
			System.out.println(dfor.format(soma));
		}
		
		scan.close();
		
	}
}
