import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		
		for (int i = 0; i < 10; i++) {
			vetor[i] = scan.nextInt();
			if (vetor[i] <= 0) {
				vetor[i] = 1;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("X[" + i + "] = " + vetor[i]);
		}
		
		scan.close();
		
	}
}
