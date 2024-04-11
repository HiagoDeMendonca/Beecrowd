import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfor = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
			
			double[] arrayPreco = {4, 4.5, 5, 2, 1.5};
			
			int codigo = scan.nextInt();
			int quantidade = scan.nextInt();
			
			System.out.println("Total: R$ " + dfor.format(arrayPreco[codigo - 1] * quantidade));
			
	}
	
}
