import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int comprimento = scan.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < comprimento; i++) {
			int item = scan.nextInt();
			if (10 <= item && item <= 20) {in++;}
			else {out++;}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		scan.close();
		
	}
}
