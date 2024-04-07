import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner meuScanner = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("0.0000");
		
		double raio = meuScanner.nextDouble();
		
		double area = raio * raio * 3.14159;
		
		System.out.println("A=" + df1.format(area));
			
		scan.close();
		
	}
	
}
