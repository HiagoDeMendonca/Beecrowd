import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome = scan.nextLine();
		
		String[] inputDataAtual = scan.nextLine().split("/");
		String[] inputNascimento = scan.nextLine().split("/");
		
		short[] dataAtual = new short[3];
		short[] nascimento = new short[3];
		
		for (byte i = 0; i < 3; i++) {
			dataAtual[i] = Short.parseShort(inputDataAtual[i]);
			nascimento[i] = Short.parseShort(inputNascimento[i]);
		}
		
		if (nascimento[0] == dataAtual[0] && nascimento[1] == dataAtual[1]) {
			
			System.out.println("Feliz aniversario!");
			
		}
		
		int idade = dataAtual[2] - nascimento[2];
		
		if (dataAtual[1] < nascimento[1]) {
			idade--;
		} else if (dataAtual[1] == nascimento[1] && dataAtual[0] < nascimento[0]) {
			idade--;
		}
		
		System.out.println("Voce tem " + idade + " anos " + nome + ".");
		
		scan.close();
		
	}
}
