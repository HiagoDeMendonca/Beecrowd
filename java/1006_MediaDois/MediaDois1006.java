import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static DecimalFormat dfor = new DecimalFormat("0.0");
	
	public static void main(String[] args) {
		
		Scanner meuScanner = new Scanner(System.in);
		
		double numeroA = meuScanner.nextDouble();
		double numeroB = meuScanner.nextDouble();
		double numeroC = meuScanner.nextDouble();
		
		double mediaPond = (numeroA * 2 + numeroB * 3 + numeroC * 5) / 10;
		
		System.out.println("MEDIA = " + dfor.format(mediaPond));
		
	}
	
}
