import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int largura = 39;
		int altura = 5;
		
		for (int i = 0; i < largura; i++) {
			
			System.out.print("-");
			
		}
		
		System.out.println();
		
		for (int i = 0; i < altura; i++) {
			
			System.out.print("|");
			
			for (int j = 0; j < largura - 2; j++) {
				System.out.print(" ");
			}
			
			System.out.println("|");
			
		}
		
		for (int i = 0; i < largura; i++) {
			
			System.out.print("-");
			
		}
		
		System.out.println();
		
		scan.close();
		
	}
}
