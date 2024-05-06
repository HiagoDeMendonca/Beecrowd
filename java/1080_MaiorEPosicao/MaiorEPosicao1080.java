import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	
		int maior = 0;
		int posicao = 0;
	
		for (int i = 0; i < 100; i++) {
			int input = scan.nextInt();
			if (input > maior) {
				maior = input;
				posicao = i + 1;
			}
		}
		
		System.out.println(maior);
		System.out.println(posicao);
		
		scan.close();
		
	}
}
