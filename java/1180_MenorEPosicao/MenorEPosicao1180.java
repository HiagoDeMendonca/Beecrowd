import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		short limite = scan.nextShort();
		
		int[] lista = new int[limite];
		
		int menor = Integer.MAX_VALUE;
		short posicao = 0;
		
		for (short i = 0; i < limite; i++) {
			lista[i] = scan.nextInt();
			if (lista[i] < menor) {
				menor = lista[i];
				posicao = i;
			}
		}
		
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posicao);
		
		scan.close();
		
	}
}
