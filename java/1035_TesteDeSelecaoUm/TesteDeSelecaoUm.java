import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		
		if (B > C && D > A && (C + D) > (A + B) && A % 2 == 0 && C == Math.abs(C) && D == Math.abs(D))
		{
			System.out.println("Valores aceitos");
		}
		else
		{
			System.out.println("Valores nao aceitos");
		}
		
	}
	
}
