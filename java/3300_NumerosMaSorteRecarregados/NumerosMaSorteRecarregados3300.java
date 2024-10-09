import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		if (input.contains("13")) {
			System.out.println(input + " es de Mala Suerte");
		} else {
			System.out.println(input + " NO es de Mala Suerte");
		}
		
		scan.close();
		
	}
}
