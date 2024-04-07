import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numeroA = scan.nextInt();
		int numeroB = scan.nextInt();
		
		int produto = numeroA * numeroB;
		
		System.out.println("PROD = " + produto);
		
		scan.close();
		
	}
	
}
