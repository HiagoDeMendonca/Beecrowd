import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int horaInicial = scan.nextInt();
		int minutoInicial = scan.nextInt();
		int horaFinal = scan.nextInt();
		int minutoFinal = scan.nextInt();
		
		int absolutoInicial = minutoInicial + horaInicial * 60;
		int absolutoFinal = minutoFinal + horaFinal * 60;
		
		int duracao = absolutoFinal - absolutoInicial;
		
		if (duracao <= 0)
		{
			duracao += 1440;
		}
		
		System.out.println("O JOGO DUROU " + duracao / 60 + " HORA(S) E " + duracao % 60 + " MINUTO(S)");   
		
		scan.close();
		
	}
}
