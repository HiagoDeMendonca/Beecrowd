import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static DecimalFormat dfor = new DecimalFormat("0.00");
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		scan.next();
		double salario = scan.nextDouble();
		double vendas = scan.nextDouble();
		
		double ganho = salario + vendas / 100 * 15;
		
		System.out.println("TOTAL = R$ " + dfor.format(ganho));
		
	}
	
}
