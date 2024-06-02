import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		int maior = Math.max(numero1, numero2);
		int menor = Math.min(numero1, numero2);
		
		int soma = 0;
		
		for (int i = menor; i <= maior; i++) {
			if (i % 13 == 0) {continue;}
			soma += i;
		}
		
		System.out.println(soma);
		
		scan.close();
		
	}
}
