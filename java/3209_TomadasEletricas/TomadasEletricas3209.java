import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		byte repeticoes = scan.nextByte();
		
		for (byte i = 0; i < repeticoes; i++) {
			short soma = 0;
			byte filtros = scan.nextByte();
			for (byte y = 0; y < filtros; y++) {
				soma += scan.nextByte();
			}
			System.out.println(soma + 1 - filtros);
		}
		
		scan.close();
		
	}
}
