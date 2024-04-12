import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		if (A % B == 0 || B % A == 0)
		{
			System.out.println("Sao Multiplos");
		}
		else
		{
			System.out.println("Nao sao Multiplos");
		}

		scan.close();
		
	}
}
