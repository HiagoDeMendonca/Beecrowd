import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.00");

	public static void main(String[] args) {
		
		short anoes = scan.nextShort();
		short distancia = scan.nextShort();
		
		System.out.println(dfor.format(distancia / (anoes + 2.0)));
		
		scan.close();
		
	}
}
