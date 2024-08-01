import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		while (scan.hasNextByte() == true) {
			byte reclamacoes = scan.nextByte();
			if (reclamacoes == 0) {
				System.out.println("vai ter copa!");
			} else {
				System.out.println("vai ter duas!");
			}
		}
		
		scan.close();
		
	}
}
