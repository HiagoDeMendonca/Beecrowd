import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int input = scan.nextInt();
		
		int resultado = input;
		
		for (int i = 1; i < input; i++) {
			resultado *= input - i;
		}
		
		System.out.println(resultado);
		
	}
}