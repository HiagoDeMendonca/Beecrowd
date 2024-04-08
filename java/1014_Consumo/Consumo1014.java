import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.000");
	
	public static void main(String[] args) {
		
		int distancia = scan.nextInt();
		float combustivel = scan.nextFloat();
		
		System.out.println(dfor.format(distancia / combustivel) + " km/l");
		
		scan.close();
		
	}
	
}
