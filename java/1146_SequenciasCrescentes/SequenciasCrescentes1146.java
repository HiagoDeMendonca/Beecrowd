import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int input = 1;
		
		while (input != 0) {
			input = scan.nextInt();
			
			for (int i = 1; i <= input; i++) {
				if (i != input) {
					System.out.print(i + " ");
				} else {
					System.out.println(i);
				}
			}
		}
		
		scan.close();
		
	}
}