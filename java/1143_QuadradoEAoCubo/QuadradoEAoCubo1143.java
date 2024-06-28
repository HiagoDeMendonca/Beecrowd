import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		short input = scan.nextShort();
		
		for (short i = 1; i <= input; i++) {
			System.out.println(i + " " + i * i + " " + i * i * i);
		}
		
		scan.close();
		
	}
}
