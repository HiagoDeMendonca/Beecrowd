import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static DecimalFormat dfor = new DecimalFormat("0.00000");
	
	public static void main(String[] args) {
		
		Scanner meuScanner = new Scanner(System.in);
		
		double numeroA = meuScanner.nextDouble();
		double numeroB = meuScanner.nextDouble();
		
		double mediaPond = (numeroA * 3.5 + numeroB * 7.5) / 11;
		
		System.out.println("MEDIA = " + dfor.format(mediaPond));
		
	}
	
}
