import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNextInt()) {
			
			int ano = scan.nextInt();
			
			System.out.println((ano - 1) / 100 + 1);
			
		}
		
		scan.close();
		
	}
}
