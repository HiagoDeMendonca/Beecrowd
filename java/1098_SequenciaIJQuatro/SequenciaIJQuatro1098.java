import java.text.DecimalFormat;

public class Main {
	
	public static void main(String[] args) {

		DecimalFormat dfor = new DecimalFormat("0.#");
		
		float i = 0;
		float j = 1;
		
		for (int y = 0; i < 2.2; y++) {
			
			System.out.println("I=" + dfor.format(i) + " J=" + dfor.format(j + y));
			
			if (y == 2) {
				y = -1;
				i = i + 0.2f;
				j = j + 0.2f;
			}
			
		}
		
	}
}
