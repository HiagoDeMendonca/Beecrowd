import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNextLine()) {
			
			String input = scan.nextLine();
			
			input = input.replace('@', 'a');
			input = input.replace('&', 'e');
			input = input.replace('!', 'i');
			input = input.replace('*', 'o');
			input = input.replace('#', 'u');
			
			System.out.println(input);
			
		}
		
		scan.close();
		
	}
}
