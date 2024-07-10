import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.0");

	public static void main(String[] args) {
		
		float[] vetor = new float[100];
		
		for (byte i = 0; i < 100; i++) {
			vetor[i] = scan.nextFloat();
		}
		
		for (byte i = 0; i < 100; i++) {
			if (vetor[i] <= 10) {
				System.out.println("A[" + i + "] = " + dfor.format(vetor[i]));
			}
		}
		
		scan.close();
		
	}
}
