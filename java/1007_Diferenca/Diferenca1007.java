import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static DecimalFormat dfor = new DecimalFormat("0.0");
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numeroA = scan.nextInt();
		int numeroB = scan.nextInt();
		int numeroC = scan.nextInt();
		int numeroD = scan.nextInt();
		
		int DIFERENCA = (numeroA * numeroB - numeroC * numeroD);
		
		System.out.println("DIFERENCA = " + DIFERENCA);
		
	}
	
}
