import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int soma = 0;
		
		soma += scan.nextInt();
		soma += scan.nextInt();
		
		System.out.println(Math.abs(soma % 2 - 1));
		
		scan.close();
		
	}
}
