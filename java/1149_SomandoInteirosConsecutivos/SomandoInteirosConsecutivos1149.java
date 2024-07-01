import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int A = scan.nextInt();
		int N = 0;
		int soma = 0;
		
		do {
			N = scan.nextInt();
		} while (N <= 0);
		
		for (int i = 0; i < N; i++) {
			soma += A + i;
		}
		
		System.out.println(soma);
		
		scan.close();
		
	}
}