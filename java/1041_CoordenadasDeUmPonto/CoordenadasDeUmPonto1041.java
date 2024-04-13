import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float X = scan.nextFloat();
		float Y = scan.nextFloat();

		int caso = 0;
		
		if (X > 0 && Y > 0) {caso = 1;}
		else if (X < 0 && Y > 0) {caso = 2;}
		else if (X < 0 && Y < 0) {caso = 3;}
		else if (X > 0 && Y < 0) {caso = 4;}
		else if (X == 0 && Y == 0) {caso = 5;}
		else if (X == 0) {caso = 6;}
		else if (Y == 0) {caso = 7;};
		
		if (caso <= 4) {System.out.println("Q" + caso);}
		else
		{
			switch (caso)
			{
				case 5:
					System.out.println("Origem");
					break;
				case 6:
					System.out.println("Eixo Y");
					break;
				case 7:
					System.out.println("Eixo X");
					break;
			}
		}
		
		scan.close();
		
	}
}
