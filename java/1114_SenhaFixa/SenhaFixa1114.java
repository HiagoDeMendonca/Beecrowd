import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int tentativa = 0;
		
		while (true) {
			
			tentativa = scan.nextInt();
			
			if (tentativa != 2002) {
				System.out.println("Senha Invalida");
			} else {
				System.out.println("Acesso Permitido");
				break;
			}
			
		}
		
		scan.close();
		
	}
}
