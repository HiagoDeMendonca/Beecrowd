import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int dias = scan.nextInt();
		
		System.out.println(dias / 365 + " ano(s)");
		System.out.println(dias % 365 / 30 + " mes(es)");
		System.out.println(dias % 365 % 30 + " dia(s)");
		
		scan.close();
		
	}
	
}
