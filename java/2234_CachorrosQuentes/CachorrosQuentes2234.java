import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		System.out.println(dfor.format((double)numero1 / numero2));
		
		scan.close();
		
	}
}
