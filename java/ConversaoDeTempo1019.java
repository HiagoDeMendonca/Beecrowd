import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.000");
	
	public static void main(String[] args) {
		
		int segundos = scan.nextInt();
		
		System.out.print(segundos / 3600 + ":");
		System.out.print(segundos % 3600 / 60 + ":");
		System.out.println(segundos % 3600 % 60);
		
		scan.close();
		
	}
	
}
