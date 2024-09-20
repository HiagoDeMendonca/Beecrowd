import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		String input = scan.nextLine();
		
		String resultado = (input.length() >= 10) ? "palavrao" : "palavrinha";
		
		System.out.println(resultado);
		
		scan.close();
		
	}
}
