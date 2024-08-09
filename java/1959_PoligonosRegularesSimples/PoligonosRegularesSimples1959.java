import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		long input1 = scan.nextLong();
		long input2 = scan.nextLong();
		
		System.out.println(input1 * input2);
		
		scan.close();
		
	}
	
}
