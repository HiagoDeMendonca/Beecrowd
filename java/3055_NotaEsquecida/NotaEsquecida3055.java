import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int nota1 = scan.nextInt();
		int media = scan.nextInt();
		
		int nota2 = media * 2 - nota1;
		
		System.out.println(nota2);
		
		scan.close();
		
	}
}
