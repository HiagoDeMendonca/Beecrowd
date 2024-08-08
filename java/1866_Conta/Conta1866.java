import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int repeticoes = scan.nextInt();
		
		for (int i = 0; i < repeticoes; i++) {
			short input = scan.nextShort();
			String output = (input % 2 == 0) ? "0" : "1";
			System.out.println(output);
		}
		
		scan.close();
		
	}
	
}
