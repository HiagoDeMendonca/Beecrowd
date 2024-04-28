import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int pares = 0;
		
		for (int i = 0; i < 5; i++) {
			float numero = scan.nextFloat();
			if (numero % 2 == 0) {
				pares++;
			}
		}
		
		System.out.println(pares + " valores pares");
		
		scan.close();
		
	}
}
