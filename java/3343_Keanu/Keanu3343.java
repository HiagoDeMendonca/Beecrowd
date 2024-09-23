import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		byte tamanho = scan.nextByte();
		
		int total = tamanho * tamanho;
		
		int pretas = total / 2;
		int brancas = total - pretas;
		
		System.out.println(brancas + " casas brancas e " + pretas + " casas pretas");
		
		scan.close();
		
	}
}
