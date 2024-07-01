import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int menor = scan.nextInt();
		int maior, soma, i;
		maior = soma = i = 0;
		
		do {
			maior = scan.nextInt();
		} while (menor >= maior);
		
		for (i = 1; soma <= maior; i++) {
			soma += menor + i - 1;
		}
		
		System.out.println(i - 1);
		
		scan.close();
		
	}
}