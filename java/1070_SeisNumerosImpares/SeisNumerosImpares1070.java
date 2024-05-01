import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int input = scan.nextInt();
		if (input % 2 == 0) {input++;}
		
		for (int i = 0; i < 6; i++) {
			System.out.println(input);
			input += 2;
		}
		
		scan.close();
		
	}
}
