import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] vetor1 = new int[20];
		
		for (byte i = 0; i < 20; i++) {
			vetor1[19 - i] = scan.nextInt();
		}
		
		for (byte i = 0; i < 20; i++) {
			System.out.println("N[" + i + "] = " + vetor1[i]);
		}
		
		scan.close();
		
	}
}
