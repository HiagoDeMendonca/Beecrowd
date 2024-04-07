import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static DecimalFormat dfor = new DecimalFormat("0.00000");
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double numeroA = scan.nextDouble();
		double numeroB = scan.nextDouble();
		
		double mediaPond = (numeroA * 3.5 + numeroB * 7.5) / 11;
		
		System.out.println("MEDIA = " + dfor.format(mediaPond));
		
		scan.close();
		
	}
	
}
