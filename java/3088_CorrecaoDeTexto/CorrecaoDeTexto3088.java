import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNextLine()) {
			
			String input = scan.nextLine();
			
			input = input.replace(" .", ".");
			input = input.replace(" ,", ",");
			
			System.out.println(input);
			
		}
		
		scan.close();
		
	}
}
