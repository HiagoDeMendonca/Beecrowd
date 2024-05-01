import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();
		
		int maior = Math.max(input1, input2);
		int contagem = Math.min(input1, input2) + 1;
		
		if (contagem % 2 == 0) {contagem++;}
		
		int resultado = 0;
		
		while (contagem < maior) {
			resultado += contagem;
			contagem += 2;
		}
		
		System.out.println(resultado);
		
		scan.close();
		
	}
}
