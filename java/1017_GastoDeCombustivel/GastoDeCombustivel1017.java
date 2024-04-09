import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.000");
	
	public static void main(String[] args) {
		
		int horas = scan.nextInt();
		int velocidade = scan.nextInt();
		
		double dDistancia = horas * velocidade;
		
		System.out.println(dfor.format(dDistancia / 12));
		
		scan.close();
		
	}
	
}
