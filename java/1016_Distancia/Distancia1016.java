import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int iDistancia = scan.nextInt();
		System.out.println((iDistancia * 2) + " minutos");
		
		scan.close();
		
	}
	
}
