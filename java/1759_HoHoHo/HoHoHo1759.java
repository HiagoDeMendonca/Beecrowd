import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int repeticoes = scan.nextInt();
		
		System.out.print("Ho");
		
		for (int i = 1; i < repeticoes; i++) {
			System.out.print(" Ho");
		}
		
		System.out.println("!");
		
		scan.close();
		
	}
	
}
