import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.00");

	public static void main(String[] args) {
		
		int input = 0;
		double soma = 0;
		int contagem = 0;
		
		while (0 == 0) {
			input = scan.nextInt();
			if (input < 0) {break;}
			soma += input;
			contagem++;
		}
		
		System.out.println(dfor.format(soma / contagem));
		
	}
}