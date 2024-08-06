import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.0");

	public static void main(String[] args) {
		
		byte nivel = 0;
		
		while (scan.hasNextInt() == true) {
			
			int limite = scan.nextInt();
			int maior = 0;
			
			for (int i = 0; i < limite; i++) {
				maior = Math.max(maior, scan.nextByte());
			}
			
			if (maior < 10) {nivel = 1;}
			else if (maior < 20) {nivel = 2;}
			else {nivel = 3;}
			
			System.out.println(nivel);
		}
		
		scan.close();
		
	}
}
