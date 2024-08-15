import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		while (scan.hasNextInt() == true) {
			
			int contagem = 0;
			int membros = scan.nextInt();
			
			for (int i = 0; i < membros; i++) {
				contagem += scan.nextInt();
			}
			
			if (contagem <= membros * 0.66) {
				System.out.println("acusacao arquivada");
			} else {
				System.out.println("impeachment");
			}
			
		}
		
		scan.close();
		
	}
}
