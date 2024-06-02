import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int novoLoop, golsInter, golsGremio, contagem;
		novoLoop = golsInter = golsGremio = contagem = 0;
		int[] resultados = new int[3]; // Inter, Empate, Grêmio
		
		do {
			
			golsInter = scan.nextInt();
			golsGremio = scan.nextInt();
			
			if (golsInter > golsGremio) {resultados[0]++;}
			else if (golsInter < golsGremio) {resultados[2]++;}
			else {resultados[1]++;}
			
			do {
				System.out.println("Novo grenal (1-sim 2-nao)");
				novoLoop = scan.nextInt();
			} while (novoLoop != 1 && novoLoop != 2);
			
			contagem++;
			
		} while (novoLoop == 1);
		
		String ganhador = "textogenerico";
		
		if (resultados[0] > resultados[2]) {
			ganhador = "Inter";
		} else {
			ganhador = "Gremio";
		}
		
		System.out.println(contagem + " grenais");
		System.out.println("Inter:" + resultados[0]);
		System.out.println("Gremio:" + resultados[2]);
		System.out.println("Empates:" + resultados[1]);
		System.out.println(ganhador + " venceu mais");
		
		scan.close();
		
	}
}
