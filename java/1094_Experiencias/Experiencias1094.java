import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.00");

	public static void main(String[] args) {
		
		short coelhos, ratos, sapos;
		coelhos = ratos = sapos = 0;
		
		short repeticoes = scan.nextShort();
		
		for (int i = 0; i < repeticoes; i++) {
			
			byte cobaias = scan.nextByte();
			char animal = scan.next().charAt(0);
			
			switch (animal) {
				case 'C':
					coelhos += cobaias;
					break;
				case 'R':
					ratos += cobaias;
					break;
				case 'S':
					sapos += cobaias;
					break;
			}
		}
		
		int total = coelhos + ratos + sapos;
		
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.println("Percentual de coelhos: " + dfor.format(coelhos * 100f / total) + " %");
		System.out.println("Percentual de ratos: " + dfor.format(ratos * 100f / total) + " %");
		System.out.println("Percentual de sapos: " + dfor.format(sapos * 100f / total) + " %");
		
		scan.close();
		
	}
}
