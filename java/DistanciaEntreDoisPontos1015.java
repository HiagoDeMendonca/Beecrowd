import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.0000");
	
	public static void main(String[] args) {
		
		float X1 = scan.nextFloat(), Y1 = scan.nextFloat();
		float X2 = scan.nextFloat(), Y2 = scan.nextFloat();
		
		double resultado = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
		
		System.out.println(dfor.format(resultado));
		
		scan.close();
		
	}
	
}
