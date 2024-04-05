import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static DecimalFormat dfor = new DecimalFormat("0.000");
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double raio = scan.nextDouble();
		
		double volume = 4 / 3.0 * 3.14159 * Math.pow(raio, 3);
		
		System.out.println("VOLUME = " + dfor.format(volume));
		
		scan.close();
		
	}
	
}
