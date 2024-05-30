import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		int contagem = 0;
		float notaSoma = 0;
		
		while (contagem < 2) {
			float nota = scan.nextFloat();
			if (nota < 0 || nota > 10) {
				System.out.println("nota invalida");
			} else {
				notaSoma += nota;
				contagem++;
			}
		}
		
		System.out.println("media = " + dfor.format(notaSoma / 2));
		
		scan.close();
		
	}
}
