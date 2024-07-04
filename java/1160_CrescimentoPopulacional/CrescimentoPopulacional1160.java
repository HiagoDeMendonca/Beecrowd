import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	static void fazerTudo() {
		
		int populacao1 = scan.nextInt();
		int populacao2 = scan.nextInt();
		
		double crescimento1 = scan.nextDouble() * 0.01;
		double crescimento2 = scan.nextDouble() * 0.01;
		
		byte tempo = 0;
		
		while (populacao1 <= populacao2 && tempo <= 100) {
			populacao1 += populacao1 * crescimento1;
			populacao2 += populacao2 * crescimento2;
			tempo++;
		}
		
		if (tempo <= 100) {
			System.out.println(tempo + " anos.");
		} else {
			System.out.println("Mais de 1 seculo.");
		}
		
	}
	
	public static void main(String[] args) {
		
		int repeticoes = scan.nextInt();
		
		for (int i = 0; i < repeticoes; i++) {
			fazerTudo();
		}
		
		scan.close();
		
	}
}
