import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
		
		Scanner meuScanner = new Scanner(System.in);
		
		int numeroA = meuScanner.nextInt();
		int numeroB = meuScanner.nextInt();
		
		int produto = numeroA * numeroB;
		
		System.out.println("PROD = " + produto);
		
    }
	
}
