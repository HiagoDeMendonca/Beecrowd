import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int input = scan.nextInt();
		int numero = 1;
		
		for (int i = 0; i < input; i++) {
			for (int y = 0; y < 3; y++) {
				System.out.print(numero + " ");
				numero++;
			}
			numero++;
			System.out.println("PUM");
		}
		
		scan.close();
		
	}
}
