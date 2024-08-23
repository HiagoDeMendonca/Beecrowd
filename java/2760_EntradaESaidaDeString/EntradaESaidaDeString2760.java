import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static String cortar (String inteiro) {
		
		return inteiro.substring(0, Math.min(inteiro.length(), 10));
		
	}
	
	public static void main(String[] args) {
		
		String input1 = scan.nextLine();
		String input2 = scan.nextLine();
		String input3 = scan.nextLine();
		
		System.out.println(input1 + input2 + input3);
		System.out.println(input2 + input3 + input1);
		System.out.println(input3 + input1 + input2);
		
		System.out.println(cortar(input1) + cortar(input2) + cortar(input3));
		
		scan.close();
		
	}
}
