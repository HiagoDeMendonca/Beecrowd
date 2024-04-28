import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	static int[] chequeTudo(float input, int[] condicoes) {
		
		if (input % 2 == 0) {
			condicoes[0] += 1;
		} else {
			condicoes[1] += 1;
		}
		if (input > 0) {
			condicoes[2] += 1;
		} else if (input < 0) {
			condicoes[3] += 1;
		}
		
		return condicoes;
		
	}
	
	public static void main(String[] args) {
		
		int[] condicoes = new int[4];
		
		for (int i = 0; i < 5; i++) {
			float numero = scan.nextFloat();
			condicoes = chequeTudo(numero, condicoes);
		}
		
		System.out.println(condicoes[0] + " valor(es) par(es)");
		System.out.println(condicoes[1] + " valor(es) impar(es)");
		System.out.println(condicoes[2] + " valor(es) positivo(s)");
		System.out.println(condicoes[3] + " valor(es) negativo(s)");
        
		scan.close();
			
	}
}
