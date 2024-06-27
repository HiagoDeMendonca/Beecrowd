import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		int maior = Math.max(numero1, numero2);
		int menor = Math.min(numero1, numero2);
		
		for (int i = menor + 1; i < maior; i++) {
			if (i % 5 == 2 || i % 5 == 3) {
				System.out.println(i);
			}
		}
		
		scan.close();
		
	}
}
