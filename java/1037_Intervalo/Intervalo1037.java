import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double input = scan.nextDouble();
        
		if (0 <= input && input <= 100)
		{
			int[] arrayIntervalos = {25, 50, 75, 100};
			
			int qual = 0;
			
			for (int i = 0; i < 4; i++)
			{
				if (input > arrayIntervalos[i]) {qual++;};
			}
			
			String caractere = "(";
			if (qual == 0) {caractere = "[";};
			
			System.out.println("Intervalo " + caractere + (arrayIntervalos[qual] - 25) + "," + arrayIntervalos[qual] + "]");
			    
		}
		else
		{
			System.out.println("Fora de intervalo");
		}

		scan.close();
		
	}
	
}
