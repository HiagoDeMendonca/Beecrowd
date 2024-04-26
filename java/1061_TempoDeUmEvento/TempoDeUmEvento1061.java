import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	static int[] medidas = {86400, 3600, 60, 1};
	static String[] nomeMedidas = {"dia", "hora", "minuto", "segundo"};
	
	static int pegarMomento() {
		
		String[] inputDia = scan.nextLine().split(" ");
		String[] inputHorario = scan.nextLine().split(" ");
		
		int[] numerosArray = new int[4];
		
		numerosArray[0] = Integer.parseInt(inputDia[1]);
		
		// i sobe de 2 em 2 para pular os ':' do input
		// [i/2+1] para que ele armazene nos indexes 1 2 e 3 do array principal
		for (int i = 0; i <= 4; i += 2) {
			numerosArray[i / 2 + 1] = Integer.parseInt(inputHorario[i]);
		}
		
		int momentoAbsoluto = 0;
		
		for (int i = 0; i < 4; i++) {
			momentoAbsoluto += numerosArray[i] * medidas[i];
		}
		
		return momentoAbsoluto;
		
	}

	public static void main(String[] args) {
		
		int momento1 = pegarMomento();
		int momento2 = pegarMomento();
		
		int duracao = momento2 - momento1;
		
		for (int i = 0; i < 4; i++) {
			System.out.println(duracao / medidas[i] + " " + nomeMedidas[i] + "(s)");
			duracao %= medidas[i];
		}
		
		scan.close();
		
	}
}
