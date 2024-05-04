import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int input = Math.abs(scan.nextInt());
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + input + " = " + input * i);
		}
		
		scan.close();
		
	}
}
