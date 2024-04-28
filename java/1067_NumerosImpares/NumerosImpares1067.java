import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int input = scan.nextInt();
		   
		for (int i = 1; i <= input; i += 2) {
			System.out.println(i);
		}
		
		scan.close();
		
	}
}
