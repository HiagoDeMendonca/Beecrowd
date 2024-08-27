import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int repeticoes = scan.nextInt();
		
		for (int i = 0; i < repeticoes; i++) {
			
			int poder = scan.nextInt();
			if (poder <= 8000) {
				System.out.println("Inseto!");
			} else {
				System.out.println("Mais de 8000!");
			}
			
		}
		
		scan.close();
		
	}
}
