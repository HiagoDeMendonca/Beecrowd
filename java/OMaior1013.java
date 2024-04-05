import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		System.out.println(Math.max(A, (Math.max(B, C))) + " eh o maior");
		
		scan.close();
		
	}
	
}
