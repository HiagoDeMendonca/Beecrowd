import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int input = 0;
		int[] combustivel = new int[3];
		
		while (input != 4) {
			input = scan.nextInt();
			if (input >= 1 && input <= 3) {
			combustivel[input - 1]++;
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + combustivel[0]);
		System.out.println("Gasolina: " + combustivel[1]);
		System.out.println("Diesel: " + combustivel[2]);
		
		scan.close();
		
	}
}
