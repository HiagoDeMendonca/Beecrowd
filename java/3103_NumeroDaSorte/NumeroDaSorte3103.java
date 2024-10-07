import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int repeticoes = Integer.parseInt(scan.nextLine());
		
		for (int y = 0; y < repeticoes; y++) {
			
			int[] algarismos = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			
			String input = scan.nextLine();
			
			for (int i = 0; i < input.length(); i++) {
				
				algarismos[Character.getNumericValue(input.charAt(i))]++;
				
			}
			
			int impressao = 1;
			boolean primeiroAlgarismo = false;
			
			while (!primeiroAlgarismo) {
				
				if (algarismos[impressao] != 0) {
					
					System.out.print(impressao);
					
					algarismos[impressao]--;
					
					primeiroAlgarismo = true;
				} else {
					impressao++;
				}
				
			}
			
			for (int i = 0; i < algarismos[0]; i++) {
				System.out.print(0);
			}
			
			while (impressao < 10) {
				
				for (int i = 0; i < algarismos[impressao]; i++) {
					System.out.print(impressao);
				}
				
				impressao++;
				
			}
			
			System.out.println();
			
		}
		
		scan.close();
		
	}
}
