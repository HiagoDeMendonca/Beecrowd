import java.text.DecimalFormat;

public class Main {
	
	static DecimalFormat dfor = new DecimalFormat("0.00");

	public static void main(String[] args) {
		
		double soma = 0;
		double numero2 = 1;
		
		for (int i = 1; i <= 39; i += 2) {
			soma += i / numero2;
			numero2 *= 2;
		}
		
		System.out.println(dfor.format(soma));
		
	}
}