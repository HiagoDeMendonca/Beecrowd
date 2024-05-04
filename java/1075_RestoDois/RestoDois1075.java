import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int input = Math.abs(scan.nextInt());
		
		if (input > 2) {
			for (int i = 2; i <= 10000; i += input) {
				System.out.println(i);
			}
		}
		
		scan.close();
		
	}
}
