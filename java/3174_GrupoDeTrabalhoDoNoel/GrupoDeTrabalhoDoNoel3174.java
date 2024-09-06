import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		String[] produtos = {"bonecos", "arquitetos", "musicos", "desenhistas"};
		byte[] precos = {8, 4, 6, 12};
		int[] horas = {0, 0, 0, 0};
		
		short repeticoes = scan.nextShort();
		byte tipo = 0;
		
		for (short y = 0; y < repeticoes; y++) {
			scan.next();
			String input = scan.next();
			
			for (byte i = 0; i < 4; i++) {
				if (input.equals(produtos[i])) {
					tipo = i;
					break;
				}
			}
			
			horas[tipo] += scan.nextShort();
		}
		
		int presentes = 0;
		
		for (byte i = 0; i < 4; i++) {
			presentes += horas[i] / precos[i];
		}
		
		System.out.println(presentes);
		
		scan.close();
		
	}
}
