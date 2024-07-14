import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		byte limite = scan.nextByte();
		
		for (short i = 0; i < 1000; i++) {
			System.out.println("N[" + i + "] = " + (i % limite));
		}
		
		scan.close();
		
	}
}
