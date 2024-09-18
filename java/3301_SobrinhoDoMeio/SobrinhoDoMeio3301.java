import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		String[] nomes = {"huguinho", "zezinho", "luisinho"};
		
		int[] idades = new int[3];
		
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		
		for (byte i = 0; i < 3; i++) {
			idades[i] = scan.nextInt();
			if (idades[i] > maior) {maior = idades[i];}
			if (idades[i] < menor) {menor = idades[i];}
		}
		
		for (byte i = 0; i < 3; i++) {
			if (idades[i] != menor && idades[i] != maior) {
				System.out.println(nomes[i]);
				break;
			}
		}
		
		scan.close();
		
	}
}
