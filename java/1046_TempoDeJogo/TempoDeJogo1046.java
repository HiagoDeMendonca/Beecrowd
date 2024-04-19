import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int horaInicial = scan.nextInt();
		int horaFinal = scan.nextInt();
		
		int duracao = horaFinal - horaInicial;
		
		if (duracao <= 0)
		{
			duracao += 24;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		scan.close();
		
	}
}
