import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while (scan.hasNextShort() == true) {
			short input = scan.nextShort();
			System.out.println(input - 1);
		}
		
		scan.close();
		
	}
}
