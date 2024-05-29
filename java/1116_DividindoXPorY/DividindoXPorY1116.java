import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int repeticoes = scan.nextInt();
		
		for (int i = 0; i < repeticoes; i++) {
			
			float numero1 = scan.nextFloat();
			float numero2 = scan.nextFloat();
			
			if (numero2 == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.println(numero1 / numero2);
			}
			
		}
		
		scan.close();
		
	}
}
