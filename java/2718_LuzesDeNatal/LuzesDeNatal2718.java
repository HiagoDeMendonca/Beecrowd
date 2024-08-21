import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int repeticoes = scan.nextInt();
		
		for (int y = 0; y < repeticoes; y++) {
			
			String binario = Long.toBinaryString(scan.nextLong());
			
			int sequenciaAtual = 0;
			int sequenciaMaxima = 0;
			
			for (int i = 0; i < binario.length(); i++) {
				
				if (binario.charAt(i) == '1') {
					sequenciaAtual++;
					if (sequenciaAtual > sequenciaMaxima) {
						sequenciaMaxima = sequenciaAtual;
					}
				} else {
					sequenciaAtual = 0;
				}
				
			}
			
			System.out.println(sequenciaMaxima);
			
		}
		
		scan.close();
		
	}
}
