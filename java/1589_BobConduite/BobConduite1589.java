import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		short limite = scan.nextShort();
		
		for (short i = 0; i < limite; i++) {
			int raio1 = scan.nextInt();
			int raio2 = scan.nextInt();
			
			System.out.println(raio1 + raio2);
		}
		
		scan.close();
		
	}
}
