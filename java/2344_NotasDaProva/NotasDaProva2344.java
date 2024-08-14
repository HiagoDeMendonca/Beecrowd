import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		byte nota = scan.nextByte();
		
		char letra = 't';
		
		if (nota == 0) {
			letra = 'E';
		} else if (nota <= 35) {
			letra = 'D';
		} else if (nota <= 60) {
			letra = 'C';
		} else if (nota <= 85) {
			letra = 'B';
		} else {
			letra = 'A';
		}
		
		System.out.println(letra);
		
		scan.close();
		
	}
}
