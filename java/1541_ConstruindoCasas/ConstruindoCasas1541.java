import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		while (1 < 2) {
			short A = scan.nextShort();
			if (A == 0) {break;}
			short B = scan.nextShort();
			byte porcentagem = scan.nextByte();
			
			int areaTotal = A * B * 100 / porcentagem;
			
			int multiplicacao = 1;
			
			while (Math.pow(multiplicacao + 1, 2) <= areaTotal) {
				multiplicacao++;
			}
			
			System.out.println(multiplicacao);
			
		}
		
		scan.close();
		
	}
}
