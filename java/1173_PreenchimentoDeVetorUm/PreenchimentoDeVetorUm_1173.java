import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		
		vetor[0] = scan.nextShort();
		
		for (byte i = 1; i < 10; i++) {
			vetor[i] = vetor[i - 1] * 2;
		}
		
		for (byte i = 0; i < 10; i++) {
			System.out.println("N[" + i + "] = " + vetor[i]);
		}
		
		scan.close();
		
	}
}
