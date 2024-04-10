import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static DecimalFormat dfor = new DecimalFormat("0.0");
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double numeroA = scan.nextDouble();
		double numeroB = scan.nextDouble();
		double numeroC = scan.nextDouble();
		
		double mediaPond = (numeroA * 2 + numeroB * 3 + numeroC * 5) / 10;
		
		System.out.println("MEDIA = " + dfor.format(mediaPond));
		
	}
	
}
