import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int repeticoes = Integer.parseInt(scan.nextLine());
		
		for (int z = 0; z < repeticoes; z++) {
			
			String resposta = scan.nextLine();
			String palpite1 = scan.nextLine();
			String palpite2 = scan.nextLine();
			
			int pontuacao1 = 0;
			int pontuacao2 = 0;
			
			boolean primeiraDiferenca = false;
			byte desempate = 0;
			
			if (palpite1.equals(palpite2)) {
				primeiraDiferenca = true;
			}
			
			for (int i = 0; i < resposta.length(); i++) {
				
				if (resposta.charAt(i) == palpite1.charAt(i)) {
					pontuacao1++;
				}
				if (resposta.charAt(i) == palpite2.charAt(i)) {
					pontuacao2++;
				}
				
				if (!primeiraDiferenca) {
					
					if (pontuacao1 > pontuacao2) {
						desempate = 1;
						primeiraDiferenca = true;
					} else if (pontuacao2 > pontuacao1) {
						desempate = 2;
						primeiraDiferenca = true;
					}
					
				}
				
			}
			
			System.out.println("Instancia " + (z + 1));
			
			if (pontuacao1 > pontuacao2) {
				System.out.println("time 1");
			} else if (pontuacao2 > pontuacao1) {
				System.out.println("time 2");
			} else if (desempate == 1) {
				System.out.println("time 1");
			} else if (desempate == 2) {
				System.out.println("time 2");
			} else {
				System.out.println("empate");
			}
			
			System.out.println();
			
		}
		
		scan.close();
		
	}
}
