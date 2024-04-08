import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static DecimalFormat dfor = new DecimalFormat("0.000");
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float A = scan.nextFloat();
		float B = scan.nextFloat();
		float C = scan.nextFloat();
		
		String[] formas = {"TRIANGULO", "CIRCULO", "TRAPEZIO", "QUADRADO", "RETANGULO"};
		double[] resultados = {(A * C / 2), (3.14159 * C * C), ((A + B) / 2 * C), (B * B), (A * B)};
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(formas[i] + ": " + dfor.format(resultados[i]));
			
		}
		
		scan.close();
		
	}
	
}
