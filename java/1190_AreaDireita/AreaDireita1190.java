import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.0");

	public static void main(String[] args) {
		
		String[][] valores = new String[12][12];
		
		char operacao = scan.next().charAt(0);
		
		for (byte y = 0; y < 12; y++) {
			for (byte x = 0; x < 12; x++) {
				valores[x][y] = scan.next();
			}
		}
		
		BigDecimal soma = new BigDecimal("0");
		short contagem = 0;
		
		for (byte y = 1; y < 11; y++) {
			for (byte x = 11; x > y && x > 11 - y; x--) {
				soma = soma.add(new BigDecimal(valores[x][y]));
				contagem++;
			}
		}
		
		if (operacao == 'M') {
			System.out.println(dfor.format(soma.divide(new BigDecimal(contagem), 2, RoundingMode.HALF_UP)));
		} else {
			System.out.println(dfor.format(soma));
		}
		
		scan.close();
		
	}
}
