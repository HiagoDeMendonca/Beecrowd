import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int input = scan.nextInt();
		
		for (int i = 2; i <= input; i += 2) {
			int quadrado = i * i;
			System.out.println(i + "^" + "2 = " + quadrado);
		}
		
		scan.close();
		
	}
}
