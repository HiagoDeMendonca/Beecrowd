import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float A = scan.nextFloat();
		float B = scan.nextFloat();
		float C = scan.nextFloat();
		
		float[] arrayInput = {A, B, C};
		Arrays.sort(arrayInput);
		
		A = arrayInput[2];
		B = arrayInput[1];
		C = arrayInput[0];
		
		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			
			if (A * A > B * B + C * C) {
				System.out.println("TRIANGULO OBTUSANGULO");
			} else if (A * A < B * B + C * C) {
				System.out.println("TRIANGULO ACUTANGULO");
			} else {
				System.out.println("TRIANGULO RETANGULO");
			}
			
			if (A == B && A == C) {
				System.out.println("TRIANGULO EQUILATERO");
			} else if (A == B || A == C || B == C) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		
		scan.close();
		
	}
}
