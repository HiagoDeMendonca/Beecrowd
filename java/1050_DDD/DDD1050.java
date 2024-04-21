import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int varDDD = scan.nextInt();
		String cidade = "cidadeGenerica";
		
		switch (varDDD) {
			case 61:
				cidade = "Brasilia";
				break;
			case 71:
				cidade = "Salvador";
				break;
			case 11:
				cidade = "Sao Paulo";
				break;
			case 21:
				cidade = "Rio de Janeiro";
				break;
			case 32:
				cidade = "Juiz de Fora";
				break;
			case 19:
				cidade = "Campinas";
				break;
			case 27:
				cidade = "Vitoria";
				break;
			case 31:
				cidade = "Belo Horizonte";
				break;
			default:
				cidade = "DDD nao cadastrado";
		}
		
		System.out.println(cidade);
		
		scan.close();
		
	}
}
