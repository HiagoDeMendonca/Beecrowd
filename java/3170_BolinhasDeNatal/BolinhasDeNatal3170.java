import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		short bolinhas = scan.nextShort();
		short galhos = scan.nextShort();
		
		int faltantes = galhos / 2 - bolinhas;
		
		if (faltantes > 0) {
			System.out.println("Faltam " + faltantes + " bolinha(s)");
		} else {
			System.out.println("Amelia tem todas bolinhas!");
		}
		
		scan.close();
		
	}
}
