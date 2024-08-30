import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.00");

	public static void main(String[] args) {
		
		float raio = scan.nextFloat();
		
		System.out.println(dfor.format(raio * 6.28));
		
		scan.close();
		
	}
}
