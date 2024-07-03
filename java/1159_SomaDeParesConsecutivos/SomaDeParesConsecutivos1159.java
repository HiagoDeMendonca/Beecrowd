import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	static int fazerTudo(int numero) {
		
		int soma = 0;
		
		if (numero % 2 != 0) {
			numero++;
		}
		
		for (int i = 0; i < 5; i++) {
			soma += numero;
			numero += 2;
		}
		
		return soma;
		
	}

	public static void main(String[] args) {
		
		int input = scan.nextInt();
		
		while (input != 0) {
		System.out.println(fazerTudo(input));
		input = scan.nextInt();
		}
		
		scan.close();
		
	}
}
