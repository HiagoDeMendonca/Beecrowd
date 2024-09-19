import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int limite = scan.nextInt();
		
		for (int i = 0; i < limite; i++) {
			int resposta = scan.nextInt();
			System.out.println("resposta " + (i + 1) + ": " + resposta);
		}
		
		scan.close();
		
	}
}
