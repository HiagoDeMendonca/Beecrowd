import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int positivos = 0;
		
		for (int i = 0; i < 6; i++) {
			float numero = scan.nextFloat();
			if (numero > 0) {positivos++;}
		}
		
		System.out.println(positivos + " valores positivos");
		
		scan.close();
		
	}
}
