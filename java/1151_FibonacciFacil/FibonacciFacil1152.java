import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int input = scan.nextInt();
		
		int[] sequencia = new int[input];
		
		sequencia[0] = 0;
		sequencia[1] = 1;
		
		for (int i = 2; i < input; i++) {
			sequencia[i] = sequencia[i - 1] + sequencia[i - 2];
		}
		
		System.out.print(sequencia[0]);
		
		for (int i = 1; i < input; i++) {
			System.out.print(" " + sequencia[i]);
		}
		
		System.out.println();
		
		scan.close();
		
	}
}