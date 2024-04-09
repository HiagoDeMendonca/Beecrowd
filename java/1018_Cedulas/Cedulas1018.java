import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.000");
	
	public static void main(String[] args) {
		
		int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
		int dinheiro = scan.nextInt();
		System.out.println(dinheiro);
		
		for (int i = 0; i < 7; i++){
			
			System.out.println(dinheiro / cedulas[i] + " nota(s) de R$ " + cedulas[i] + ",00");
			dinheiro %= cedulas[i];
			
		}
		
		scan.close();
		
	}
	
}
