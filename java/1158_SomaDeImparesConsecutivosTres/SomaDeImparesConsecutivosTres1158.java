import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	static int fazerTudo() {
		int inicio = scan.nextInt();
		int quantos = scan.nextInt();
		
		int soma = 0;
		
		if (inicio % 2 == 0) {
			inicio++;
		}
		
		for (int i = 0; i < quantos; i++) {
			soma += inicio;
			inicio += 2;
		}
		
		return soma;
		
	}

	public static void main(String[] args) {
		
		int repeticoes = scan.nextInt();
		
		
		for (int i = 0; i < repeticoes; i++) {
			System.out.println(fazerTudo());
		}
		
		scan.close();
		
	}
}