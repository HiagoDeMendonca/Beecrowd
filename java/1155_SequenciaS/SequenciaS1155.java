import java.text.DecimalFormat;

public class Main {
	
	static DecimalFormat dfor = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		double soma = 0;
		
		for (int i = 1; i <= 100; i++) {
			soma += 1.0 / i;
		}
		
		System.out.println(dfor.format(soma));
		
	}
}