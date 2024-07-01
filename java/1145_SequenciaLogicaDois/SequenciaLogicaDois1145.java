import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int largura = scan.nextInt();
		int limite = scan.nextInt();
		
		for (int i = 1; i <= limite; i++) {
			String formatacao = (i % largura == 0) ? "\n" : " ";
			System.out.print(i + formatacao);
		}
		
		scan.close();
		
	}
}