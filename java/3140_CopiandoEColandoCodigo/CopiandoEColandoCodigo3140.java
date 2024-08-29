import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean escrever = false;
		
		while (scan.hasNextLine() == true) {
			
			String input = scan.nextLine();
			
			if (input.contains("</body>")) {
				escrever = false;
				
			} else if (escrever == true) {
				System.out.println(input);
				
			} else if (input.contains("<body>")) {
				escrever = true;
				
			}
			
			
		}
		
		scan.close();
		
	}
}
