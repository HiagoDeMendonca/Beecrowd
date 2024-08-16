import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int repeticoes = Integer.parseInt(scan.nextLine());
		
		for (int i = 0; i < repeticoes; i++) {
			
			scan.nextLine();
			System.out.println("I am Toorg!");
			
		}
		
		scan.close();
		
	}
}
