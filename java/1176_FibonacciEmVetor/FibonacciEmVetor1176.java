import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		long[] sequencia = new long[61];
		
		sequencia[0] = 0;
		sequencia[1] = 1;
		
		for (byte i = 2; i < 61; i++) {
			sequencia[i] = sequencia[i - 1] + sequencia[i - 2];
		}
		
		short testes = scan.nextShort();
		byte item = 0;
		
		for (short i = 0; i < testes; i++) {
			item = scan.nextByte();
			System.out.println("Fib(" + item + ") = " + sequencia[item]);
		}
		
		scan.close();
		
	}
}
