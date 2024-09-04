import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		byte input1 = scan.nextByte();
		short input2 = scan.nextShort();
		
		String[] frutas = new String[input1];
		boolean[] gostos = new boolean[input1];
		
		for (short i = 0; i < input1; i++) {
			frutas[i] = scan.next().toLowerCase();
		}
		
		for (short i = 0; i < input2; i++) {
			String linha = scan.next().toLowerCase();
			for (short y = 0; y < input1; y++) {
				
				if (gostos[y] == true) {continue;}
				if (linha.contains(frutas[y]) || linha.contains(new StringBuilder(frutas[y]).reverse().toString())) {
					gostos[y] = true;
				}
			}
		}
		
		for (short i = 0; i < input1; i++) {
			if (gostos[i]) {
				System.out.println("Sheldon come a fruta " + frutas[i]);
			} else {
				System.out.println("Sheldon detesta a fruta " + frutas[i]);
			}
		}
		
		scan.close();
		
	}
}
